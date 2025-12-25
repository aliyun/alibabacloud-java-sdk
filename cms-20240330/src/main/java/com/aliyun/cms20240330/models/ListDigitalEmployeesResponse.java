// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDigitalEmployeesResponseBody body;

    public static ListDigitalEmployeesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeesResponse self = new ListDigitalEmployeesResponse();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDigitalEmployeesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDigitalEmployeesResponse setBody(ListDigitalEmployeesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDigitalEmployeesResponseBody getBody() {
        return this.body;
    }

}
