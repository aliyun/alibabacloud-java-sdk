// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReportUploadStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportUploadStatusResponseBody body;

    public static ReportUploadStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadStatusResponse self = new ReportUploadStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportUploadStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUploadStatusResponse setBody(ReportUploadStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUploadStatusResponseBody getBody() {
        return this.body;
    }

}
