// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class UrlAsyncModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UrlAsyncModerationResponseBody body;

    public static UrlAsyncModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        UrlAsyncModerationResponse self = new UrlAsyncModerationResponse();
        return TeaModel.build(map, self);
    }

    public UrlAsyncModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UrlAsyncModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UrlAsyncModerationResponse setBody(UrlAsyncModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public UrlAsyncModerationResponseBody getBody() {
        return this.body;
    }

}
