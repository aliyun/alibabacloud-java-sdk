// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitExportTermsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitExportTermsTaskResponseBody body;

    public static SubmitExportTermsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitExportTermsTaskResponse self = new SubmitExportTermsTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitExportTermsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitExportTermsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitExportTermsTaskResponse setBody(SubmitExportTermsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitExportTermsTaskResponseBody getBody() {
        return this.body;
    }

}
