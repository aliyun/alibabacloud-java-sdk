// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class EnableOperationServiceInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static EnableOperationServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableOperationServiceInstanceResponseBody self = new EnableOperationServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableOperationServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
