// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDiagnoseReportResponseBody body;

    public static ListDiagnoseReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseReportResponse self = new ListDiagnoseReportResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnoseReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnoseReportResponse setBody(ListDiagnoseReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnoseReportResponseBody getBody() {
        return this.body;
    }

}
