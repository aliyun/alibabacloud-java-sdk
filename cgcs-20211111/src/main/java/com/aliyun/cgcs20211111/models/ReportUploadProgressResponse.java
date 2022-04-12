// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReportUploadProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportUploadProgressResponseBody body;

    public static ReportUploadProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportUploadProgressResponse self = new ReportUploadProgressResponse();
        return TeaModel.build(map, self);
    }

    public ReportUploadProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportUploadProgressResponse setBody(ReportUploadProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportUploadProgressResponseBody getBody() {
        return this.body;
    }

}
