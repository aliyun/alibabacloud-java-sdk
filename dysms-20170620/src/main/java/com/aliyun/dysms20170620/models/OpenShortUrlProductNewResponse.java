// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class OpenShortUrlProductNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenShortUrlProductNewResponseBody body;

    public static OpenShortUrlProductNewResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenShortUrlProductNewResponse self = new OpenShortUrlProductNewResponse();
        return TeaModel.build(map, self);
    }

    public OpenShortUrlProductNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenShortUrlProductNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenShortUrlProductNewResponse setBody(OpenShortUrlProductNewResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenShortUrlProductNewResponseBody getBody() {
        return this.body;
    }

}
