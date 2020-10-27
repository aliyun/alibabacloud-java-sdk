// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PrivatePoolOptionsId")
    @Validation(required = true)
    public String privatePoolOptionsId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static CreateElasticityAssuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticityAssuranceResponse self = new CreateElasticityAssuranceResponse();
        return TeaModel.build(map, self);
    }

    public CreateElasticityAssuranceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateElasticityAssuranceResponse setPrivatePoolOptionsId(String privatePoolOptionsId) {
        this.privatePoolOptionsId = privatePoolOptionsId;
        return this;
    }
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

    public CreateElasticityAssuranceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
