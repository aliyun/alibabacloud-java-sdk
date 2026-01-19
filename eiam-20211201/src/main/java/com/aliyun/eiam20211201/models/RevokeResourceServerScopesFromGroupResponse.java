// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeResourceServerScopesFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeResourceServerScopesFromGroupResponseBody body;

    public static RevokeResourceServerScopesFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourceServerScopesFromGroupResponse self = new RevokeResourceServerScopesFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RevokeResourceServerScopesFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeResourceServerScopesFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeResourceServerScopesFromGroupResponse setBody(RevokeResourceServerScopesFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeResourceServerScopesFromGroupResponseBody getBody() {
        return this.body;
    }

}
