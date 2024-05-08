// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTtsQuestionResponseBody body;

    public static CreateTtsQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionResponse self = new CreateTtsQuestionResponse();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTtsQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTtsQuestionResponse setBody(CreateTtsQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTtsQuestionResponseBody getBody() {
        return this.body;
    }

}
