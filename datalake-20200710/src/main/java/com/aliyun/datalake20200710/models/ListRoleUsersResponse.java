// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListRoleUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRoleUsersResponseBody body;

    public static ListRoleUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoleUsersResponse self = new ListRoleUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListRoleUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoleUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoleUsersResponse setBody(ListRoleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoleUsersResponseBody getBody() {
        return this.body;
    }

}
