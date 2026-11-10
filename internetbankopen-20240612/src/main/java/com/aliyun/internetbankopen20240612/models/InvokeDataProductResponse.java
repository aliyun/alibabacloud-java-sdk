// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class InvokeDataProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeDataProductResponseBody body;

    public static InvokeDataProductResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataProductResponse self = new InvokeDataProductResponse();
        return TeaModel.build(map, self);
    }

    public InvokeDataProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeDataProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeDataProductResponse setBody(InvokeDataProductResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeDataProductResponseBody getBody() {
        return this.body;
    }

}
