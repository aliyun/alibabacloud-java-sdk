// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AnswerSqlSyntaxByMetaAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnswerSqlSyntaxByMetaAgentResponseBody body;

    public static AnswerSqlSyntaxByMetaAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        AnswerSqlSyntaxByMetaAgentResponse self = new AnswerSqlSyntaxByMetaAgentResponse();
        return TeaModel.build(map, self);
    }

    public AnswerSqlSyntaxByMetaAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnswerSqlSyntaxByMetaAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnswerSqlSyntaxByMetaAgentResponse setBody(AnswerSqlSyntaxByMetaAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public AnswerSqlSyntaxByMetaAgentResponseBody getBody() {
        return this.body;
    }

}
