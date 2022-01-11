// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class CreateRPCPathTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRPCPathTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRPCPathTestResponseBody self = new CreateRPCPathTestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRPCPathTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
