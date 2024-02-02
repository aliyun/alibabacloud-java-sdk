// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDistributedProductResponseBody body;

    public static ListDistributedProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedProductResponse self = new ListDistributedProductResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributedProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributedProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributedProductResponse setBody(ListDistributedProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributedProductResponseBody getBody() {
        return this.body;
    }

}
