// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicItemSupplierPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBasicItemSupplierPriceResponseBody body;

    public static ModifyBasicItemSupplierPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicItemSupplierPriceResponse self = new ModifyBasicItemSupplierPriceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBasicItemSupplierPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBasicItemSupplierPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBasicItemSupplierPriceResponse setBody(ModifyBasicItemSupplierPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBasicItemSupplierPriceResponseBody getBody() {
        return this.body;
    }

}
