// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateResourcePoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePoolResponseBody self = new CreateResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
