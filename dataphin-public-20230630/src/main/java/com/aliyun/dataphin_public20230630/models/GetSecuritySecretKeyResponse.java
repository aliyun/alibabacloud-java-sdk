// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSecuritySecretKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecuritySecretKeyResponseBody body;

    public static GetSecuritySecretKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySecretKeyResponse self = new GetSecuritySecretKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetSecuritySecretKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecuritySecretKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecuritySecretKeyResponse setBody(GetSecuritySecretKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecuritySecretKeyResponseBody getBody() {
        return this.body;
    }

}
