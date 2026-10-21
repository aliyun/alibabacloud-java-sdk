// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RetryImageCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryImageCacheResponseBody body;

    public static RetryImageCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryImageCacheResponse self = new RetryImageCacheResponse();
        return TeaModel.build(map, self);
    }

    public RetryImageCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryImageCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryImageCacheResponse setBody(RetryImageCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryImageCacheResponseBody getBody() {
        return this.body;
    }

}
