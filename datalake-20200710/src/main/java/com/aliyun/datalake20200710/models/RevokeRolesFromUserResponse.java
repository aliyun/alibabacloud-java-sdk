// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokeRolesFromUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeRolesFromUserResponseBody body;

    public static RevokeRolesFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeRolesFromUserResponse self = new RevokeRolesFromUserResponse();
        return TeaModel.build(map, self);
    }

    public RevokeRolesFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeRolesFromUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeRolesFromUserResponse setBody(RevokeRolesFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeRolesFromUserResponseBody getBody() {
        return this.body;
    }

}
