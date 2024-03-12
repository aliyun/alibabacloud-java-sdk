// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationToOrganizationalUnitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeApplicationToOrganizationalUnitsResponseBody body;

    public static AuthorizeApplicationToOrganizationalUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationToOrganizationalUnitsResponse self = new AuthorizeApplicationToOrganizationalUnitsResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationToOrganizationalUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeApplicationToOrganizationalUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeApplicationToOrganizationalUnitsResponse setBody(AuthorizeApplicationToOrganizationalUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeApplicationToOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

}
