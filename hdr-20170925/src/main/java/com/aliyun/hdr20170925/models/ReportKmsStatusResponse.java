// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportKmsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportKmsStatusResponseBody body;

    public static ReportKmsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportKmsStatusResponse self = new ReportKmsStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportKmsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportKmsStatusResponse setBody(ReportKmsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportKmsStatusResponseBody getBody() {
        return this.body;
    }

}
