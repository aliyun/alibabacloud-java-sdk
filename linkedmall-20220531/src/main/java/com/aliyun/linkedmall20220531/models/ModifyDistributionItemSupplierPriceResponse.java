// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ModifyDistributionItemSupplierPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDistributionItemSupplierPriceResponseBody body;

    public static ModifyDistributionItemSupplierPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributionItemSupplierPriceResponse self = new ModifyDistributionItemSupplierPriceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDistributionItemSupplierPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDistributionItemSupplierPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDistributionItemSupplierPriceResponse setBody(ModifyDistributionItemSupplierPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDistributionItemSupplierPriceResponseBody getBody() {
        return this.body;
    }

}
