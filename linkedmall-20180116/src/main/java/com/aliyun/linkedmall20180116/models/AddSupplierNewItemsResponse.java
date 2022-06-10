// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddSupplierNewItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddSupplierNewItemsResponseBody body;

    public static AddSupplierNewItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSupplierNewItemsResponse self = new AddSupplierNewItemsResponse();
        return TeaModel.build(map, self);
    }

    public AddSupplierNewItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSupplierNewItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSupplierNewItemsResponse setBody(AddSupplierNewItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSupplierNewItemsResponseBody getBody() {
        return this.body;
    }

}
