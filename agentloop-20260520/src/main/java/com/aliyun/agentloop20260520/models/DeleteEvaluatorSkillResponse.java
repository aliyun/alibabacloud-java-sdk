// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteEvaluatorSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEvaluatorSkillResponseBody body;

    public static DeleteEvaluatorSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEvaluatorSkillResponse self = new DeleteEvaluatorSkillResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEvaluatorSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEvaluatorSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEvaluatorSkillResponse setBody(DeleteEvaluatorSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEvaluatorSkillResponseBody getBody() {
        return this.body;
    }

}
