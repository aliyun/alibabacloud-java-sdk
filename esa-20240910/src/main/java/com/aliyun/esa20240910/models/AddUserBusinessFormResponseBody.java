// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AddUserBusinessFormResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserBusinessFormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserBusinessFormResponseBody self = new AddUserBusinessFormResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserBusinessFormResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
