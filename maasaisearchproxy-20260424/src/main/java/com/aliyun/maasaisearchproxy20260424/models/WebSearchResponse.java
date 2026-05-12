// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class WebSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebSearchResponseBody body;

    public static WebSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        WebSearchResponse self = new WebSearchResponse();
        return TeaModel.build(map, self);
    }

    public WebSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WebSearchResponse setBody(WebSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public WebSearchResponseBody getBody() {
        return this.body;
    }

}
