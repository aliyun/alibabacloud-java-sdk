// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GeneratePresignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GeneratePresignedUrlResponseBody body;

    public static GeneratePresignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GeneratePresignedUrlResponse self = new GeneratePresignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public GeneratePresignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GeneratePresignedUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GeneratePresignedUrlResponse setBody(GeneratePresignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GeneratePresignedUrlResponseBody getBody() {
        return this.body;
    }

}
