// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImportTermsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FetchImportTermsTaskResponseBody body;

    public static FetchImportTermsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchImportTermsTaskResponse self = new FetchImportTermsTaskResponse();
        return TeaModel.build(map, self);
    }

    public FetchImportTermsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchImportTermsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FetchImportTermsTaskResponse setBody(FetchImportTermsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchImportTermsTaskResponseBody getBody() {
        return this.body;
    }

}
