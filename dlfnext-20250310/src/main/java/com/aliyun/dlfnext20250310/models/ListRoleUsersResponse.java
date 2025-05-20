// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListRoleUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
