// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRoleFromUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeRoleFromUsersResponseBody body;

    public static RevokeRoleFromUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeRoleFromUsersResponse self = new RevokeRoleFromUsersResponse();
        return TeaModel.build(map, self);
    }

    public RevokeRoleFromUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeRoleFromUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeRoleFromUsersResponse setBody(RevokeRoleFromUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeRoleFromUsersResponseBody getBody() {
        return this.body;
    }

}
