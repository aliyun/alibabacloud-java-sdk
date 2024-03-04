// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteGeneratedContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGeneratedContentResponseBody body;

    public static DeleteGeneratedContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGeneratedContentResponse self = new DeleteGeneratedContentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGeneratedContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGeneratedContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGeneratedContentResponse setBody(DeleteGeneratedContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGeneratedContentResponseBody getBody() {
        return this.body;
    }

}
