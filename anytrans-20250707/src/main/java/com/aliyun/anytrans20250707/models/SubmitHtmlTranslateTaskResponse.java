// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitHtmlTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitHtmlTranslateTaskResponseBody body;

    public static SubmitHtmlTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHtmlTranslateTaskResponse self = new SubmitHtmlTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHtmlTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitHtmlTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitHtmlTranslateTaskResponse setBody(SubmitHtmlTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitHtmlTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
