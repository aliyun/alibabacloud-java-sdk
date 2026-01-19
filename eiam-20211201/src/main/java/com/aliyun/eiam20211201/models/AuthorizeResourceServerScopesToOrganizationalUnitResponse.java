// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeResourceServerScopesToOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeResourceServerScopesToOrganizationalUnitResponseBody body;

    public static AuthorizeResourceServerScopesToOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceServerScopesToOrganizationalUnitResponse self = new AuthorizeResourceServerScopesToOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitResponse setBody(AuthorizeResourceServerScopesToOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeResourceServerScopesToOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
