// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateMonitorDataReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitorDataReportResponseBody body;

    public static CreateMonitorDataReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorDataReportResponse self = new CreateMonitorDataReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorDataReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorDataReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorDataReportResponse setBody(CreateMonitorDataReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorDataReportResponseBody getBody() {
        return this.body;
    }

}
