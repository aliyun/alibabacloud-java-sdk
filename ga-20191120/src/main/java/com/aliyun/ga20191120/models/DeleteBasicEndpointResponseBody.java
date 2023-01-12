// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicEndpointResponseBody extends TeaModel {
    /**
     * <p>The ID of the endpoint.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBasicEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicEndpointResponseBody self = new DeleteBasicEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBasicEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DeleteBasicEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
