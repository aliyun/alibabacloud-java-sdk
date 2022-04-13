// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PrivatePoolOptionsId")
    public String privatePoolOptionsId;

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
