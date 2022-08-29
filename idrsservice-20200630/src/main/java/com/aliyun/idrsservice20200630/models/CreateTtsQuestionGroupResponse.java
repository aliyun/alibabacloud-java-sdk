// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTtsQuestionGroupResponseBody body;

    public static CreateTtsQuestionGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionGroupResponse self = new CreateTtsQuestionGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTtsQuestionGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTtsQuestionGroupResponse setBody(CreateTtsQuestionGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTtsQuestionGroupResponseBody getBody() {
        return this.body;
    }

}
