// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersForDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedUsersForDatabaseResponseBody body;

    public static ListAuthorizedUsersForDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersForDatabaseResponse self = new ListAuthorizedUsersForDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersForDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedUsersForDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedUsersForDatabaseResponse setBody(ListAuthorizedUsersForDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedUsersForDatabaseResponseBody getBody() {
        return this.body;
    }

}
