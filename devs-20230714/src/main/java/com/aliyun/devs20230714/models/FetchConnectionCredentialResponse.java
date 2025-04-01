// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class FetchConnectionCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OAuthCredential body;

    public static FetchConnectionCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchConnectionCredentialResponse self = new FetchConnectionCredentialResponse();
        return TeaModel.build(map, self);
    }

    public FetchConnectionCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchConnectionCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchConnectionCredentialResponse setBody(OAuthCredential body) {
        this.body = body;
        return this;
    }
    public OAuthCredential getBody() {
        return this.body;
    }

}
