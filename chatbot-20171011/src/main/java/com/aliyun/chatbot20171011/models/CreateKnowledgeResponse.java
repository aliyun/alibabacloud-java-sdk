// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateKnowledgeResponseBody body;

    public static CreateKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeResponse self = new CreateKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeResponse setBody(CreateKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeResponseBody getBody() {
        return this.body;
    }

}
