// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetRecentDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRecentDocumentResponseBody body;

    public static GetRecentDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecentDocumentResponse self = new GetRecentDocumentResponse();
        return TeaModel.build(map, self);
    }

    public GetRecentDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRecentDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRecentDocumentResponse setBody(GetRecentDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRecentDocumentResponseBody getBody() {
        return this.body;
    }

}
