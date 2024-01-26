// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RevokeCoordinatePrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeCoordinatePrivilegeResponseBody body;

    public static RevokeCoordinatePrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeCoordinatePrivilegeResponse self = new RevokeCoordinatePrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public RevokeCoordinatePrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeCoordinatePrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeCoordinatePrivilegeResponse setBody(RevokeCoordinatePrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeCoordinatePrivilegeResponseBody getBody() {
        return this.body;
    }

}
