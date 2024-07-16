// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ResumeCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeCardsResponseBody body;

    public static ResumeCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeCardsResponse self = new ResumeCardsResponse();
        return TeaModel.build(map, self);
    }

    public ResumeCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeCardsResponse setBody(ResumeCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeCardsResponseBody getBody() {
        return this.body;
    }

}
