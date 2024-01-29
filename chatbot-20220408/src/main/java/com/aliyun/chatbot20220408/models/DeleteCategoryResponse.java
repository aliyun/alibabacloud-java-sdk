// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCategoryResponse setBody(DeleteCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCategoryResponseBody getBody() {
        return this.body;
    }

}
