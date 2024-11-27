// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersForInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedUsersForInstanceResponseBody body;

    public static ListAuthorizedUsersForInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersForInstanceResponse self = new ListAuthorizedUsersForInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersForInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedUsersForInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedUsersForInstanceResponse setBody(ListAuthorizedUsersForInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedUsersForInstanceResponseBody getBody() {
        return this.body;
    }

}
