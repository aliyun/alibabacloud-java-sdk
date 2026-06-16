// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebFetchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebFetchResponseBody body;

    public static WebFetchResponse build(java.util.Map<String, ?> map) throws Exception {
        WebFetchResponse self = new WebFetchResponse();
        return TeaModel.build(map, self);
    }

    public WebFetchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebFetchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WebFetchResponse setBody(WebFetchResponseBody body) {
        this.body = body;
        return this;
    }
    public WebFetchResponseBody getBody() {
        return this.body;
    }

}
