// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentAnalyzeResultResponseBody body;

    public static GetDocumentAnalyzeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentAnalyzeResultResponse self = new GetDocumentAnalyzeResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentAnalyzeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentAnalyzeResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentAnalyzeResultResponse setBody(GetDocumentAnalyzeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentAnalyzeResultResponseBody getBody() {
        return this.body;
    }

}
