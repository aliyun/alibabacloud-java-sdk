// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListIdentityProviderDepartmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdentityProviderDepartmentsResponseBody body;

    public static ListIdentityProviderDepartmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProviderDepartmentsResponse self = new ListIdentityProviderDepartmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentityProviderDepartmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdentityProviderDepartmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdentityProviderDepartmentsResponse setBody(ListIdentityProviderDepartmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdentityProviderDepartmentsResponseBody getBody() {
        return this.body;
    }

}
