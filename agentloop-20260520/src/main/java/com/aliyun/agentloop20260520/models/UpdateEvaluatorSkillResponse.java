// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEvaluatorSkillResponseBody body;

    public static UpdateEvaluatorSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluatorSkillResponse self = new UpdateEvaluatorSkillResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluatorSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEvaluatorSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEvaluatorSkillResponse setBody(UpdateEvaluatorSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEvaluatorSkillResponseBody getBody() {
        return this.body;
    }

}
