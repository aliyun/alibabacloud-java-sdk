// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorComputeSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDoctorComputeSummaryResponseBody body;

    public static ListDoctorComputeSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorComputeSummaryResponse self = new ListDoctorComputeSummaryResponse();
        return TeaModel.build(map, self);
    }

    public ListDoctorComputeSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoctorComputeSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDoctorComputeSummaryResponse setBody(ListDoctorComputeSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoctorComputeSummaryResponseBody getBody() {
        return this.body;
    }

}
