// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDatabaseUserPermssionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatabaseUserPermssionsResponseBody body;

    public static ListDatabaseUserPermssionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseUserPermssionsResponse self = new ListDatabaseUserPermssionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseUserPermssionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseUserPermssionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseUserPermssionsResponse setBody(ListDatabaseUserPermssionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseUserPermssionsResponseBody getBody() {
        return this.body;
    }

}
