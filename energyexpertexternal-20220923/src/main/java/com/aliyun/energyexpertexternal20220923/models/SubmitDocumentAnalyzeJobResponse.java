// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocumentAnalyzeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocumentAnalyzeJobResponseBody body;

    public static SubmitDocumentAnalyzeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentAnalyzeJobResponse self = new SubmitDocumentAnalyzeJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentAnalyzeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocumentAnalyzeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocumentAnalyzeJobResponse setBody(SubmitDocumentAnalyzeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocumentAnalyzeJobResponseBody getBody() {
        return this.body;
    }

}
