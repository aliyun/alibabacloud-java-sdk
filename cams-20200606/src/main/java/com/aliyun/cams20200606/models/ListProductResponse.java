// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductResponseBody body;

    public static ListProductResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductResponse self = new ListProductResponse();
        return TeaModel.build(map, self);
    }

    public ListProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductResponse setBody(ListProductResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductResponseBody getBody() {
        return this.body;
    }

}
