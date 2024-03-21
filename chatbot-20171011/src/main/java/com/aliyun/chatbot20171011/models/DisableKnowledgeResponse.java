// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DisableKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableKnowledgeResponseBody body;

    public static DisableKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableKnowledgeResponse self = new DisableKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public DisableKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableKnowledgeResponse setBody(DisableKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableKnowledgeResponseBody getBody() {
        return this.body;
    }

}
