// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateDataKeyResponseBody body;

    public static GenerateDataKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyResponse self = new GenerateDataKeyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDataKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDataKeyResponse setBody(GenerateDataKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDataKeyResponseBody getBody() {
        return this.body;
    }

}
