// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateKnowledgeResponseBody body;

    public static UpdateKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeResponse self = new UpdateKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeResponse setBody(UpdateKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeResponseBody getBody() {
        return this.body;
    }

}
