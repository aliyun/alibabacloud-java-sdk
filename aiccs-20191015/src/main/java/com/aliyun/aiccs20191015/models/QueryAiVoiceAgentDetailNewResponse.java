// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiVoiceAgentDetailNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAiVoiceAgentDetailNewResponseBody body;

    public static QueryAiVoiceAgentDetailNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiVoiceAgentDetailNewResponse self = new QueryAiVoiceAgentDetailNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiVoiceAgentDetailNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiVoiceAgentDetailNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAiVoiceAgentDetailNewResponse setBody(QueryAiVoiceAgentDetailNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiVoiceAgentDetailNewResponseBody getBody() {
        return this.body;
    }

}
