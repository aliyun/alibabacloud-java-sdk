// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportUserConfigResponseBody body;

    public static ReportUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUserConfigResponse self = new ReportUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public ReportUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportUserConfigResponse setBody(ReportUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUserConfigResponseBody getBody() {
        return this.body;
    }

}
