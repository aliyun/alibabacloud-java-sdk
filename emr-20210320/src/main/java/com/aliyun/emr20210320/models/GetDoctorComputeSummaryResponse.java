// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorComputeSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorComputeSummaryResponseBody body;

    public static GetDoctorComputeSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorComputeSummaryResponse self = new GetDoctorComputeSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorComputeSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorComputeSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorComputeSummaryResponse setBody(GetDoctorComputeSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorComputeSummaryResponseBody getBody() {
        return this.body;
    }

}
