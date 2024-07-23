// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The elasticity assurance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eap-bp67acfmxazb4****</p>
     */
    @NameInMap("PrivatePoolOptionsId")
    public String privatePoolOptionsId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateElasticityAssuranceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticityAssuranceResponseBody self = new CreateElasticityAssuranceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateElasticityAssuranceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateElasticityAssuranceResponseBody setPrivatePoolOptionsId(String privatePoolOptionsId) {
        this.privatePoolOptionsId = privatePoolOptionsId;
        return this;
    }
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

    public CreateElasticityAssuranceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
