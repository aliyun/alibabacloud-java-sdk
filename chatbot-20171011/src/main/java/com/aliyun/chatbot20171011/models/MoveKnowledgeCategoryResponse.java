// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class MoveKnowledgeCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveKnowledgeCategoryResponseBody body;

    public static MoveKnowledgeCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveKnowledgeCategoryResponse self = new MoveKnowledgeCategoryResponse();
        return TeaModel.build(map, self);
    }

    public MoveKnowledgeCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveKnowledgeCategoryResponse setBody(MoveKnowledgeCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveKnowledgeCategoryResponseBody getBody() {
        return this.body;
    }

}
