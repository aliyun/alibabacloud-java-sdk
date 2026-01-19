// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeResourceServerScopesFromClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeResourceServerScopesFromClientResponseBody body;

    public static RevokeResourceServerScopesFromClientResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourceServerScopesFromClientResponse self = new RevokeResourceServerScopesFromClientResponse();
        return TeaModel.build(map, self);
    }

    public RevokeResourceServerScopesFromClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeResourceServerScopesFromClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeResourceServerScopesFromClientResponse setBody(RevokeResourceServerScopesFromClientResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeResourceServerScopesFromClientResponseBody getBody() {
        return this.body;
    }

}
