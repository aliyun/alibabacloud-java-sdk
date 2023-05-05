// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAdminStsCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAdminStsCredentialResponseBody body;

    public static GetAdminStsCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdminStsCredentialResponse self = new GetAdminStsCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetAdminStsCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdminStsCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdminStsCredentialResponse setBody(GetAdminStsCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdminStsCredentialResponseBody getBody() {
        return this.body;
    }

}
