// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportDevConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportDevConfigResponseBody body;

    public static ReportDevConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDevConfigResponse self = new ReportDevConfigResponse();
        return TeaModel.build(map, self);
    }

    public ReportDevConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDevConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportDevConfigResponse setBody(ReportDevConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDevConfigResponseBody getBody() {
        return this.body;
    }

}
