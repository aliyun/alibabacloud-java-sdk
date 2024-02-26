// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class ReportBizAlertInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportBizAlertInfoResponseBody body;

    public static ReportBizAlertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportBizAlertInfoResponse self = new ReportBizAlertInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportBizAlertInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportBizAlertInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportBizAlertInfoResponse setBody(ReportBizAlertInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportBizAlertInfoResponseBody getBody() {
        return this.body;
    }

}
