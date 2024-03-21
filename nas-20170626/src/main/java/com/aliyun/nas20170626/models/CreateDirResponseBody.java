// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDirResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDirResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDirResponseBody self = new CreateDirResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDirResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
