// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDataDiagnoseReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataDiagnoseReportsResponseBody body;

    public static ListDataDiagnoseReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnoseReportsResponse self = new ListDataDiagnoseReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnoseReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataDiagnoseReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataDiagnoseReportsResponse setBody(ListDataDiagnoseReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataDiagnoseReportsResponseBody getBody() {
        return this.body;
    }

}
