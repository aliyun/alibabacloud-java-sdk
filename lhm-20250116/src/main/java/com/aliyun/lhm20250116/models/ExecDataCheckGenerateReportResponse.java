// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckGenerateReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckGenerateReportResponseBody body;

    public static ExecDataCheckGenerateReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckGenerateReportResponse self = new ExecDataCheckGenerateReportResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckGenerateReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckGenerateReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckGenerateReportResponse setBody(ExecDataCheckGenerateReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckGenerateReportResponseBody getBody() {
        return this.body;
    }

}
