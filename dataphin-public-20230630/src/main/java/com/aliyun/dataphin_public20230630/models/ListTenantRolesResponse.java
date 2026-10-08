// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListTenantRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTenantRolesResponseBody body;

    public static ListTenantRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantRolesResponse self = new ListTenantRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantRolesResponse setBody(ListTenantRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantRolesResponseBody getBody() {
        return this.body;
    }

}
