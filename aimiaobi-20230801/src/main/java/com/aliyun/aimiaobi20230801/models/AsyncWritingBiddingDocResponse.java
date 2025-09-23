// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncWritingBiddingDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsyncWritingBiddingDocResponseBody body;

    public static AsyncWritingBiddingDocResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncWritingBiddingDocResponse self = new AsyncWritingBiddingDocResponse();
        return TeaModel.build(map, self);
    }

    public AsyncWritingBiddingDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncWritingBiddingDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncWritingBiddingDocResponse setBody(AsyncWritingBiddingDocResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncWritingBiddingDocResponseBody getBody() {
        return this.body;
    }

}
