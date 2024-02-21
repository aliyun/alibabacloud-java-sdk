// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorReportComponentSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDoctorReportComponentSummaryResponseBody body;

    public static GetDoctorReportComponentSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorReportComponentSummaryResponse self = new GetDoctorReportComponentSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetDoctorReportComponentSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoctorReportComponentSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDoctorReportComponentSummaryResponse setBody(GetDoctorReportComponentSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoctorReportComponentSummaryResponseBody getBody() {
        return this.body;
    }

}
