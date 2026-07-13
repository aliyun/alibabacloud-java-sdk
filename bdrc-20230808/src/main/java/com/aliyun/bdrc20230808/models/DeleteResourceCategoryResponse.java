// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DeleteResourceCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceCategoryResponseBody body;

    public static DeleteResourceCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceCategoryResponse self = new DeleteResourceCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceCategoryResponse setBody(DeleteResourceCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceCategoryResponseBody getBody() {
        return this.body;
    }

}
