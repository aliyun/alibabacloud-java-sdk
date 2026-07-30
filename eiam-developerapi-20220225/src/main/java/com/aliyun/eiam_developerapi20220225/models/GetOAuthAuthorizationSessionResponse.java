// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOAuthAuthorizationSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOAuthAuthorizationSessionResponseBody body;

    public static GetOAuthAuthorizationSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOAuthAuthorizationSessionResponse self = new GetOAuthAuthorizationSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetOAuthAuthorizationSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOAuthAuthorizationSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOAuthAuthorizationSessionResponse setBody(GetOAuthAuthorizationSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOAuthAuthorizationSessionResponseBody getBody() {
        return this.body;
    }

}
