// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckDownloadReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckDownloadReportResponseBody body;

    public static ExecDataCheckDownloadReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckDownloadReportResponse self = new ExecDataCheckDownloadReportResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckDownloadReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckDownloadReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckDownloadReportResponse setBody(ExecDataCheckDownloadReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckDownloadReportResponseBody getBody() {
        return this.body;
    }

}
