// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitLongTextTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitLongTextTranslateTaskResponseBody body;

    public static SubmitLongTextTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitLongTextTranslateTaskResponse self = new SubmitLongTextTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitLongTextTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitLongTextTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitLongTextTranslateTaskResponse setBody(SubmitLongTextTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitLongTextTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
