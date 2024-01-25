// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportScreenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportScreenResponseBody body;

    public static ReportScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportScreenResponse self = new ReportScreenResponse();
        return TeaModel.build(map, self);
    }

    public ReportScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportScreenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportScreenResponse setBody(ReportScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportScreenResponseBody getBody() {
        return this.body;
    }

}
