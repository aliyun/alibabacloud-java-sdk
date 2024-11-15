// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateAnswerLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAnswerLibResponseBody body;

    public static CreateAnswerLibResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAnswerLibResponse self = new CreateAnswerLibResponse();
        return TeaModel.build(map, self);
    }

    public CreateAnswerLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAnswerLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAnswerLibResponse setBody(CreateAnswerLibResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAnswerLibResponseBody getBody() {
        return this.body;
    }

}
