// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentCompareResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentCompareResultResponseBody body;

    public static GetDocumentCompareResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentCompareResultResponse self = new GetDocumentCompareResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentCompareResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentCompareResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentCompareResultResponse setBody(GetDocumentCompareResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentCompareResultResponseBody getBody() {
        return this.body;
    }

}
