// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteVideoProcessingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVideoProcessingResponseBody body;

    public static DeleteVideoProcessingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoProcessingResponse self = new DeleteVideoProcessingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVideoProcessingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVideoProcessingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVideoProcessingResponse setBody(DeleteVideoProcessingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVideoProcessingResponseBody getBody() {
        return this.body;
    }

}
