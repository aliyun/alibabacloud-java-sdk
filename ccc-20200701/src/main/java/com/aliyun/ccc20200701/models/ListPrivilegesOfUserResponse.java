// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPrivilegesOfUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivilegesOfUserResponseBody body;

    public static ListPrivilegesOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivilegesOfUserResponse self = new ListPrivilegesOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivilegesOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivilegesOfUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivilegesOfUserResponse setBody(ListPrivilegesOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivilegesOfUserResponseBody getBody() {
        return this.body;
    }

}
