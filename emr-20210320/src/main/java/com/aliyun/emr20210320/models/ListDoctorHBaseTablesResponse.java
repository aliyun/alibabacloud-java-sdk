// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHBaseTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorHBaseTablesResponseBody body;

    public static ListDoctorHBaseTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHBaseTablesResponse self = new ListDoctorHBaseTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorHBaseTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorHBaseTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorHBaseTablesResponse setBody(ListDoctorHBaseTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorHBaseTablesResponseBody getBody() {
        return this.body;
    }

}
