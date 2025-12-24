// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateUploadAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUploadAuthResponseBody body;

    public static GenerateUploadAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadAuthResponse self = new GenerateUploadAuthResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUploadAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUploadAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUploadAuthResponse setBody(GenerateUploadAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUploadAuthResponseBody getBody() {
        return this.body;
    }

}
