// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportServersStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportServersStatusResponseBody body;

    public static ReportServersStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportServersStatusResponse self = new ReportServersStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportServersStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportServersStatusResponse setBody(ReportServersStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportServersStatusResponseBody getBody() {
        return this.body;
    }

}
