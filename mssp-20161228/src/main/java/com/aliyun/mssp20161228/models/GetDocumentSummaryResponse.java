// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentSummaryResponseBody body;

    public static GetDocumentSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentSummaryResponse self = new GetDocumentSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentSummaryResponse setBody(GetDocumentSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentSummaryResponseBody getBody() {
        return this.body;
    }

}
