// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PublishKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishKnowledgeResponseBody body;

    public static PublishKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishKnowledgeResponse self = new PublishKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public PublishKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishKnowledgeResponse setBody(PublishKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishKnowledgeResponseBody getBody() {
        return this.body;
    }

}
