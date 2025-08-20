// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CloseChatInstanceSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseChatInstanceSessionsResponseBody body;

    public static CloseChatInstanceSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseChatInstanceSessionsResponse self = new CloseChatInstanceSessionsResponse();
        return TeaModel.build(map, self);
    }

    public CloseChatInstanceSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseChatInstanceSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseChatInstanceSessionsResponse setBody(CloseChatInstanceSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseChatInstanceSessionsResponseBody getBody() {
        return this.body;
    }

}
