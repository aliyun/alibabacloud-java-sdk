// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluatorSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEvaluatorSkillsResponseBody body;

    public static ListEvaluatorSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluatorSkillsResponse self = new ListEvaluatorSkillsResponse();
        return TeaModel.build(map, self);
    }

    public ListEvaluatorSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEvaluatorSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEvaluatorSkillsResponse setBody(ListEvaluatorSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEvaluatorSkillsResponseBody getBody() {
        return this.body;
    }

}
