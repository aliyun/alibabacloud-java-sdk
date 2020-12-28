// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PurchaseReservedInstancesOfferingResponseBody body;

    public static PurchaseReservedInstancesOfferingResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseReservedInstancesOfferingResponse self = new PurchaseReservedInstancesOfferingResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseReservedInstancesOfferingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurchaseReservedInstancesOfferingResponse setBody(PurchaseReservedInstancesOfferingResponseBody body) {
        this.body = body;
        return this;
    }
    public PurchaseReservedInstancesOfferingResponseBody getBody() {
        return this.body;
    }

}
