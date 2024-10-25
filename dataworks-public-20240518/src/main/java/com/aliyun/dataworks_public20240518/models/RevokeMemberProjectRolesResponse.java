// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RevokeMemberProjectRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeMemberProjectRolesResponseBody body;

    public static RevokeMemberProjectRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeMemberProjectRolesResponse self = new RevokeMemberProjectRolesResponse();
        return TeaModel.build(map, self);
    }

    public RevokeMemberProjectRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeMemberProjectRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeMemberProjectRolesResponse setBody(RevokeMemberProjectRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeMemberProjectRolesResponseBody getBody() {
        return this.body;
    }

}
