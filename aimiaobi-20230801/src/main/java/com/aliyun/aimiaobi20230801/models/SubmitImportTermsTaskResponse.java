// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitImportTermsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitImportTermsTaskResponseBody body;

    public static SubmitImportTermsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportTermsTaskResponse self = new SubmitImportTermsTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImportTermsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImportTermsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImportTermsTaskResponse setBody(SubmitImportTermsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImportTermsTaskResponseBody getBody() {
        return this.body;
    }

}
