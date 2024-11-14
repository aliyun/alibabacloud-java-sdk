// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAICoachTaskSessionResponseBody body;

    public static CreateAICoachTaskSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskSessionResponse self = new CreateAICoachTaskSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAICoachTaskSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAICoachTaskSessionResponse setBody(CreateAICoachTaskSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAICoachTaskSessionResponseBody getBody() {
        return this.body;
    }

}
