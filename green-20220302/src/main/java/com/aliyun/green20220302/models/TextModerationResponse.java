// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextModerationResponseBody body;

    public static TextModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        TextModerationResponse self = new TextModerationResponse();
        return TeaModel.build(map, self);
    }

    public TextModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TextModerationResponse setBody(TextModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public TextModerationResponseBody getBody() {
        return this.body;
    }

}
