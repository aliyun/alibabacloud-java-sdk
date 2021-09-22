// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DisableOperationServiceInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DisableOperationServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableOperationServiceInstanceResponseBody self = new DisableOperationServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableOperationServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
