// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotKnowledgeStatDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBotKnowledgeStatDataResponseBody body;

    public static GetBotKnowledgeStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBotKnowledgeStatDataResponse self = new GetBotKnowledgeStatDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBotKnowledgeStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBotKnowledgeStatDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBotKnowledgeStatDataResponse setBody(GetBotKnowledgeStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBotKnowledgeStatDataResponseBody getBody() {
        return this.body;
    }

}
