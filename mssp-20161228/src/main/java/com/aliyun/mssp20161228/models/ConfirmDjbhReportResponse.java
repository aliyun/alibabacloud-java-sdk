// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class ConfirmDjbhReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmDjbhReportResponseBody body;

    public static ConfirmDjbhReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDjbhReportResponse self = new ConfirmDjbhReportResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmDjbhReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmDjbhReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmDjbhReportResponse setBody(ConfirmDjbhReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmDjbhReportResponseBody getBody() {
        return this.body;
    }

}
