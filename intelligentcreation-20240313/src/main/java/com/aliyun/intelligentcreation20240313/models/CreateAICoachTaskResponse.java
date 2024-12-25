// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAICoachTaskResponseBody body;

    public static CreateAICoachTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskResponse self = new CreateAICoachTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAICoachTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAICoachTaskResponse setBody(CreateAICoachTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAICoachTaskResponseBody getBody() {
        return this.body;
    }

}
