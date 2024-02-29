// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectRolesResponseBody body;

    public static ListProjectRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesResponse self = new ListProjectRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectRolesResponse setBody(ListProjectRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectRolesResponseBody getBody() {
        return this.body;
    }

}
