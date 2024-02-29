// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PmsEventReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PmsEventReportResponseBody body;

    public static PmsEventReportResponse build(java.util.Map<String, ?> map) throws Exception {
        PmsEventReportResponse self = new PmsEventReportResponse();
        return TeaModel.build(map, self);
    }

    public PmsEventReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PmsEventReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PmsEventReportResponse setBody(PmsEventReportResponseBody body) {
        this.body = body;
        return this;
    }
    public PmsEventReportResponseBody getBody() {
        return this.body;
    }

}
