// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDepartmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDepartmentsResponseBody body;

    public static ListDepartmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDepartmentsResponse self = new ListDepartmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListDepartmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDepartmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDepartmentsResponse setBody(ListDepartmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDepartmentsResponseBody getBody() {
        return this.body;
    }

}
