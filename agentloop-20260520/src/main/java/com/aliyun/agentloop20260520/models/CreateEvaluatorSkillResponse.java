// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluatorSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEvaluatorSkillResponseBody body;

    public static CreateEvaluatorSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatorSkillResponse self = new CreateEvaluatorSkillResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatorSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEvaluatorSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEvaluatorSkillResponse setBody(CreateEvaluatorSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEvaluatorSkillResponseBody getBody() {
        return this.body;
    }

}
