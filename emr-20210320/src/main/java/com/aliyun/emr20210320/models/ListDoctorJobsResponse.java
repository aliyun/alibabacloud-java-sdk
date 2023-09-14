// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDoctorJobsResponseBody body;

    public static ListDoctorJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorJobsResponse self = new ListDoctorJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorJobsResponse setBody(ListDoctorJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorJobsResponseBody getBody() {
        return this.body;
    }

}
