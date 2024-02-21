// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorReportsResponseBody body;

    public static ListDoctorReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorReportsResponse self = new ListDoctorReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorReportsResponse setBody(ListDoctorReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorReportsResponseBody getBody() {
        return this.body;
    }

}
