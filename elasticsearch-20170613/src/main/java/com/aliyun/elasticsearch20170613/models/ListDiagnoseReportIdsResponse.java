// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDiagnoseReportIdsResponseBody body;

    public static ListDiagnoseReportIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseReportIdsResponse self = new ListDiagnoseReportIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseReportIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnoseReportIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnoseReportIdsResponse setBody(ListDiagnoseReportIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnoseReportIdsResponseBody getBody() {
        return this.body;
    }

}
