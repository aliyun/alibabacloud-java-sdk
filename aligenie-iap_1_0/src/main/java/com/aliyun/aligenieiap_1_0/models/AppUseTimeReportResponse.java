// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class AppUseTimeReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AppUseTimeReportResponseBody body;

    public static AppUseTimeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        AppUseTimeReportResponse self = new AppUseTimeReportResponse();
        return TeaModel.build(map, self);
    }

    public AppUseTimeReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppUseTimeReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppUseTimeReportResponse setBody(AppUseTimeReportResponseBody body) {
        this.body = body;
        return this;
    }
    public AppUseTimeReportResponseBody getBody() {
        return this.body;
    }

}
