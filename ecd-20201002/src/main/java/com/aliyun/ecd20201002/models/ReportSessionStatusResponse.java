// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportSessionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportSessionStatusResponseBody body;

    public static ReportSessionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportSessionStatusResponse self = new ReportSessionStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportSessionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportSessionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportSessionStatusResponse setBody(ReportSessionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportSessionStatusResponseBody getBody() {
        return this.body;
    }

}
