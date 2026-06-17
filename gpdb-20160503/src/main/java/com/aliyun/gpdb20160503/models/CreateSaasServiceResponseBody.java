// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSaasServiceResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agdb-eqxwj5tj5ojx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static CreateSaasServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSaasServiceResponseBody self = new CreateSaasServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSaasServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSaasServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSaasServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
