// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class SubmitImageTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitImageTranslateTaskResponseBody body;

    public static SubmitImageTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageTranslateTaskResponse self = new SubmitImageTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImageTranslateTaskResponse setBody(SubmitImageTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
