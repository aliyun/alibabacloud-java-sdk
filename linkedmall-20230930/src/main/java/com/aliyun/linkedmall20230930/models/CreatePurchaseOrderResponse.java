// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreatePurchaseOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PurchaseOrderCreateResult body;

    public static CreatePurchaseOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePurchaseOrderResponse self = new CreatePurchaseOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePurchaseOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePurchaseOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePurchaseOrderResponse setBody(PurchaseOrderCreateResult body) {
        this.body = body;
        return this;
    }
    public PurchaseOrderCreateResult getBody() {
        return this.body;
    }

}
