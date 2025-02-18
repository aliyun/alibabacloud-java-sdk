// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SelectionGroupRemoveProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SelectionGroupRemoveProductResponseBody body;

    public static SelectionGroupRemoveProductResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectionGroupRemoveProductResponse self = new SelectionGroupRemoveProductResponse();
        return TeaModel.build(map, self);
    }

    public SelectionGroupRemoveProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectionGroupRemoveProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectionGroupRemoveProductResponse setBody(SelectionGroupRemoveProductResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectionGroupRemoveProductResponseBody getBody() {
        return this.body;
    }

}
