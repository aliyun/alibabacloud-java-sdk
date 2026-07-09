// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluatorSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEvaluatorSkillResponseBody body;

    public static GetEvaluatorSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluatorSkillResponse self = new GetEvaluatorSkillResponse();
        return TeaModel.build(map, self);
    }

    public GetEvaluatorSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEvaluatorSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEvaluatorSkillResponse setBody(GetEvaluatorSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEvaluatorSkillResponseBody getBody() {
        return this.body;
    }

}
