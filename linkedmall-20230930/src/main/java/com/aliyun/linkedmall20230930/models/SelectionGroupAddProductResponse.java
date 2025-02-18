// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SelectionGroupAddProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SelectionGroupAddProductResponseBody body;

    public static SelectionGroupAddProductResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectionGroupAddProductResponse self = new SelectionGroupAddProductResponse();
        return TeaModel.build(map, self);
    }

    public SelectionGroupAddProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectionGroupAddProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectionGroupAddProductResponse setBody(SelectionGroupAddProductResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectionGroupAddProductResponseBody getBody() {
        return this.body;
    }

}
