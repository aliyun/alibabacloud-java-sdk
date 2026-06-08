// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PollAskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PollAskResultResponseBody body;

    public static PollAskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        PollAskResultResponse self = new PollAskResultResponse();
        return TeaModel.build(map, self);
    }

    public PollAskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PollAskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PollAskResultResponse setBody(PollAskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public PollAskResultResponseBody getBody() {
        return this.body;
    }

}
