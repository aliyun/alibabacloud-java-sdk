// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportSessionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ReportSessionStatusResponse setBody(ReportSessionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportSessionStatusResponseBody getBody() {
        return this.body;
    }

}
