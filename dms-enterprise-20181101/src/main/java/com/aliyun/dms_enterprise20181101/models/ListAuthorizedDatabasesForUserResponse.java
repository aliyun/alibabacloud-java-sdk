// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedDatabasesForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedDatabasesForUserResponseBody body;

    public static ListAuthorizedDatabasesForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDatabasesForUserResponse self = new ListAuthorizedDatabasesForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDatabasesForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedDatabasesForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedDatabasesForUserResponse setBody(ListAuthorizedDatabasesForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedDatabasesForUserResponseBody getBody() {
        return this.body;
    }

}
