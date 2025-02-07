// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class RevokeEndpointAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeEndpointAclResponseBody body;

    public static RevokeEndpointAclResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeEndpointAclResponse self = new RevokeEndpointAclResponse();
        return TeaModel.build(map, self);
    }

    public RevokeEndpointAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeEndpointAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeEndpointAclResponse setBody(RevokeEndpointAclResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeEndpointAclResponseBody getBody() {
        return this.body;
    }

}
