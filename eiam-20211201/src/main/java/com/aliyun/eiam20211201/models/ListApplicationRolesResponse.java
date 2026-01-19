// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationRolesResponseBody body;

    public static ListApplicationRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationRolesResponse self = new ListApplicationRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationRolesResponse setBody(ListApplicationRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationRolesResponseBody getBody() {
        return this.body;
    }

}
