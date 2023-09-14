// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorJobsStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDoctorJobsStatsResponseBody body;

    public static ListDoctorJobsStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorJobsStatsResponse self = new ListDoctorJobsStatsResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorJobsStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorJobsStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorJobsStatsResponse setBody(ListDoctorJobsStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorJobsStatsResponseBody getBody() {
        return this.body;
    }

}
