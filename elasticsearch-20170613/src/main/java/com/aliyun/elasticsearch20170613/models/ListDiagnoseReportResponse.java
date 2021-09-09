// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDiagnoseReportResponse setBody(ListDiagnoseReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnoseReportResponseBody getBody() {
        return this.body;
    }

}
