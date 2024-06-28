// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RejectChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectChatResponseBody body;

    public static RejectChatResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectChatResponse self = new RejectChatResponse();
        return TeaModel.build(map, self);
    }

    public RejectChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectChatResponse setBody(RejectChatResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectChatResponseBody getBody() {
        return this.body;
    }

}
