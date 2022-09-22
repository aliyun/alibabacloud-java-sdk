// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class PurchaseStorageCapacityUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PurchaseStorageCapacityUnitResponseBody body;

    public static PurchaseStorageCapacityUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseStorageCapacityUnitResponse self = new PurchaseStorageCapacityUnitResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseStorageCapacityUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PurchaseStorageCapacityUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PurchaseStorageCapacityUnitResponse setBody(PurchaseStorageCapacityUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public PurchaseStorageCapacityUnitResponseBody getBody() {
        return this.body;
    }

}
