// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteKnowledgeResponseBody body;

    public static DeleteKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeResponse self = new DeleteKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKnowledgeResponse setBody(DeleteKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKnowledgeResponseBody getBody() {
        return this.body;
    }

}
