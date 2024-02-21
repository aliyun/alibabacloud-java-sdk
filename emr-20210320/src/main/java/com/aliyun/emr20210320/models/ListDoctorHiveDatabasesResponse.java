// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHiveDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorHiveDatabasesResponseBody body;

    public static ListDoctorHiveDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHiveDatabasesResponse self = new ListDoctorHiveDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorHiveDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorHiveDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorHiveDatabasesResponse setBody(ListDoctorHiveDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorHiveDatabasesResponseBody getBody() {
        return this.body;
    }

}
