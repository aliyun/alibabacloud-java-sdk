// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushReportResponseBody body;

    public static PushReportResponse build(java.util.Map<String, ?> map) throws Exception {
        PushReportResponse self = new PushReportResponse();
        return TeaModel.build(map, self);
    }

    public PushReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushReportResponse setBody(PushReportResponseBody body) {
        this.body = body;
        return this;
    }
    public PushReportResponseBody getBody() {
        return this.body;
    }

}
