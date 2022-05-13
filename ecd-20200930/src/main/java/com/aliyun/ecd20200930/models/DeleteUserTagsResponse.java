// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserTagsResponseBody body;

    public static DeleteUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserTagsResponse self = new DeleteUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserTagsResponse setBody(DeleteUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserTagsResponseBody getBody() {
        return this.body;
    }

}
