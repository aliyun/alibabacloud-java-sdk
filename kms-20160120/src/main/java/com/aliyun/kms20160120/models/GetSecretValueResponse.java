// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecretValueResponseBody body;

    public static GetSecretValueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretValueResponse self = new GetSecretValueResponse();
        return TeaModel.build(map, self);
    }

    public GetSecretValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecretValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecretValueResponse setBody(GetSecretValueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretValueResponseBody getBody() {
        return this.body;
    }

}
