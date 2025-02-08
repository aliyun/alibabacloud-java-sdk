// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteImageTransformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImageTransformResponseBody body;

    public static DeleteImageTransformResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageTransformResponse self = new DeleteImageTransformResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageTransformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageTransformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageTransformResponse setBody(DeleteImageTransformResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageTransformResponseBody getBody() {
        return this.body;
    }

}
