// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PublishKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PublishKnowledgeResponse setBody(PublishKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishKnowledgeResponseBody getBody() {
        return this.body;
    }

}
