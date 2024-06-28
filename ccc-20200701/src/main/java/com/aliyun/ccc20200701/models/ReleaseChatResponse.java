// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ReleaseChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseChatResponseBody body;

    public static ReleaseChatResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseChatResponse self = new ReleaseChatResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseChatResponse setBody(ReleaseChatResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseChatResponseBody getBody() {
        return this.body;
    }

}
