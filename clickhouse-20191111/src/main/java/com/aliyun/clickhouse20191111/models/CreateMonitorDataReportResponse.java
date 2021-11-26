// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateMonitorDataReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMonitorDataReportResponse setBody(CreateMonitorDataReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorDataReportResponseBody getBody() {
        return this.body;
    }

}
