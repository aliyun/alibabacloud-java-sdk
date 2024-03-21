// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCategoryResponseBody body;

    public static UpdateCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryResponse self = new UpdateCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCategoryResponse setBody(UpdateCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCategoryResponseBody getBody() {
        return this.body;
    }

}
