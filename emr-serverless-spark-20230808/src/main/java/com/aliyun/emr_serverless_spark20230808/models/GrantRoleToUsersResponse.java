// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GrantRoleToUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantRoleToUsersResponseBody body;

    public static GrantRoleToUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantRoleToUsersResponse self = new GrantRoleToUsersResponse();
        return TeaModel.build(map, self);
    }

    public GrantRoleToUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantRoleToUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantRoleToUsersResponse setBody(GrantRoleToUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantRoleToUsersResponseBody getBody() {
        return this.body;
    }

}
