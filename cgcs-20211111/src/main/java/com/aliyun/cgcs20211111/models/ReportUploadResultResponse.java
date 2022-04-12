// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReportUploadResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportUploadResultResponseBody body;

    public static ReportUploadResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadResultResponse self = new ReportUploadResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportUploadResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUploadResultResponse setBody(ReportUploadResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUploadResultResponseBody getBody() {
        return this.body;
    }

}
