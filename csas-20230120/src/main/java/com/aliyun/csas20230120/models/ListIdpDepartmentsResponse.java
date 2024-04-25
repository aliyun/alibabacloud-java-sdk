// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListIdpDepartmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdpDepartmentsResponseBody body;

    public static ListIdpDepartmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdpDepartmentsResponse self = new ListIdpDepartmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListIdpDepartmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdpDepartmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdpDepartmentsResponse setBody(ListIdpDepartmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdpDepartmentsResponseBody getBody() {
        return this.body;
    }

}
