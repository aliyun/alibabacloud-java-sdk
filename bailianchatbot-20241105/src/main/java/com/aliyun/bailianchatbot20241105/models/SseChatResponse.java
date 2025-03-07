// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianchatbot20241105.models;

import com.aliyun.tea.*;

public class SseChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SseChatResponseBody body;

    public static SseChatResponse build(java.util.Map<String, ?> map) throws Exception {
        SseChatResponse self = new SseChatResponse();
        return TeaModel.build(map, self);
    }

    public SseChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SseChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SseChatResponse setBody(SseChatResponseBody body) {
        this.body = body;
        return this;
    }
    public SseChatResponseBody getBody() {
        return this.body;
    }

}
