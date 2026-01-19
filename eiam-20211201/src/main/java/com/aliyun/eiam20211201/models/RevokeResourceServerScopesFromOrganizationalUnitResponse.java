// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeResourceServerScopesFromOrganizationalUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeResourceServerScopesFromOrganizationalUnitResponseBody body;

    public static RevokeResourceServerScopesFromOrganizationalUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourceServerScopesFromOrganizationalUnitResponse self = new RevokeResourceServerScopesFromOrganizationalUnitResponse();
        return TeaModel.build(map, self);
    }

    public RevokeResourceServerScopesFromOrganizationalUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeResourceServerScopesFromOrganizationalUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeResourceServerScopesFromOrganizationalUnitResponse setBody(RevokeResourceServerScopesFromOrganizationalUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeResourceServerScopesFromOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

}
