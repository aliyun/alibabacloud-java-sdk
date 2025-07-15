// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchExportTermsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchExportTermsTaskResponseBody body;

    public static FetchExportTermsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchExportTermsTaskResponse self = new FetchExportTermsTaskResponse();
        return TeaModel.build(map, self);
    }

    public FetchExportTermsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchExportTermsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchExportTermsTaskResponse setBody(FetchExportTermsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchExportTermsTaskResponseBody getBody() {
        return this.body;
    }

}
