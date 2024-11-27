// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentPageResponseBody body;

    public static GetDocumentPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentPageResponse self = new GetDocumentPageResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentPageResponse setBody(GetDocumentPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentPageResponseBody getBody() {
        return this.body;
    }

}
