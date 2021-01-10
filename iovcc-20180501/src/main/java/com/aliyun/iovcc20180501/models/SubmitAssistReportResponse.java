// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class SubmitAssistReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAssistReportResponseBody body;

    public static SubmitAssistReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssistReportResponse self = new SubmitAssistReportResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAssistReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAssistReportResponse setBody(SubmitAssistReportResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAssistReportResponseBody getBody() {
        return this.body;
    }

}
