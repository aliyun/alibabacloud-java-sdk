// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportNodeStatusResponseBody body;

    public static ReportNodeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportNodeStatusResponse self = new ReportNodeStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportNodeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportNodeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportNodeStatusResponse setBody(ReportNodeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportNodeStatusResponseBody getBody() {
        return this.body;
    }

}
