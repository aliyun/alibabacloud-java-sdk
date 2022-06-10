// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifySupplierPriceAndPriceCentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySupplierPriceAndPriceCentResponseBody body;

    public static ModifySupplierPriceAndPriceCentResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupplierPriceAndPriceCentResponse self = new ModifySupplierPriceAndPriceCentResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupplierPriceAndPriceCentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupplierPriceAndPriceCentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupplierPriceAndPriceCentResponse setBody(ModifySupplierPriceAndPriceCentResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupplierPriceAndPriceCentResponseBody getBody() {
        return this.body;
    }

}
