// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ClaimChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClaimChatResponseBody body;

    public static ClaimChatResponse build(java.util.Map<String, ?> map) throws Exception {
        ClaimChatResponse self = new ClaimChatResponse();
        return TeaModel.build(map, self);
    }

    public ClaimChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClaimChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClaimChatResponse setBody(ClaimChatResponseBody body) {
        this.body = body;
        return this;
    }
    public ClaimChatResponseBody getBody() {
        return this.body;
    }

}
