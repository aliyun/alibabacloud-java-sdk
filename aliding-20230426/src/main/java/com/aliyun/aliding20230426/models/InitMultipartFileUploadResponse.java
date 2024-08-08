// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InitMultipartFileUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitMultipartFileUploadResponseBody body;

    public static InitMultipartFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        InitMultipartFileUploadResponse self = new InitMultipartFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public InitMultipartFileUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitMultipartFileUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitMultipartFileUploadResponse setBody(InitMultipartFileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public InitMultipartFileUploadResponseBody getBody() {
        return this.body;
    }

}
