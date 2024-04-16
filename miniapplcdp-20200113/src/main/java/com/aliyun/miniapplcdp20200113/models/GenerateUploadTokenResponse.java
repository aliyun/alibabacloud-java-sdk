// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUploadTokenResponseBody body;

    public static GenerateUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadTokenResponse self = new GenerateUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUploadTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUploadTokenResponse setBody(GenerateUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUploadTokenResponseBody getBody() {
        return this.body;
    }

}
