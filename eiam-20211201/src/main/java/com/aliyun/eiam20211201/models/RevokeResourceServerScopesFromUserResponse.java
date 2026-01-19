// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeResourceServerScopesFromUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeResourceServerScopesFromUserResponseBody body;

    public static RevokeResourceServerScopesFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourceServerScopesFromUserResponse self = new RevokeResourceServerScopesFromUserResponse();
        return TeaModel.build(map, self);
    }

    public RevokeResourceServerScopesFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeResourceServerScopesFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeResourceServerScopesFromUserResponse setBody(RevokeResourceServerScopesFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeResourceServerScopesFromUserResponseBody getBody() {
        return this.body;
    }

}
