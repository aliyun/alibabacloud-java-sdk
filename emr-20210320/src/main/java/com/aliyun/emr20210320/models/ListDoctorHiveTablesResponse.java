// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHiveTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorHiveTablesResponseBody body;

    public static ListDoctorHiveTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHiveTablesResponse self = new ListDoctorHiveTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorHiveTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorHiveTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorHiveTablesResponse setBody(ListDoctorHiveTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorHiveTablesResponseBody getBody() {
        return this.body;
    }

}
