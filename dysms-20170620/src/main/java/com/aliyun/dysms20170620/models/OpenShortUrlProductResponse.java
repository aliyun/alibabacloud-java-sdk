// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class OpenShortUrlProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenShortUrlProductResponseBody body;

    public static OpenShortUrlProductResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenShortUrlProductResponse self = new OpenShortUrlProductResponse();
        return TeaModel.build(map, self);
    }

    public OpenShortUrlProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenShortUrlProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenShortUrlProductResponse setBody(OpenShortUrlProductResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenShortUrlProductResponseBody getBody() {
        return this.body;
    }

}
