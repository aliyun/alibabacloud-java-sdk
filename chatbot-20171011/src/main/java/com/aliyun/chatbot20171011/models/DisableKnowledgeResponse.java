// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DisableKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableKnowledgeResponse setBody(DisableKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableKnowledgeResponseBody getBody() {
        return this.body;
    }

}
