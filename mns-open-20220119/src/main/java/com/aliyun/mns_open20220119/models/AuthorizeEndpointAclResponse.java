// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class AuthorizeEndpointAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeEndpointAclResponseBody body;

    public static AuthorizeEndpointAclResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeEndpointAclResponse self = new AuthorizeEndpointAclResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeEndpointAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeEndpointAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeEndpointAclResponse setBody(AuthorizeEndpointAclResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeEndpointAclResponseBody getBody() {
        return this.body;
    }

}
