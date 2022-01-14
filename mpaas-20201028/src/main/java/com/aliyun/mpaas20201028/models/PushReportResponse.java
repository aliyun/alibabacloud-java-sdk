// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PushReportResponse setBody(PushReportResponseBody body) {
        this.body = body;
        return this;
    }
    public PushReportResponseBody getBody() {
        return this.body;
    }

}
