// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCategoryResponseBody body;

    public static DeleteCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCategoryResponse self = new DeleteCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCategoryResponse setBody(DeleteCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCategoryResponseBody getBody() {
        return this.body;
    }

}
