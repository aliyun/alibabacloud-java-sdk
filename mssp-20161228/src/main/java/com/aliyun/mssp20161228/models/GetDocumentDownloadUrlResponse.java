// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentDownloadUrlResponseBody body;

    public static GetDocumentDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentDownloadUrlResponse self = new GetDocumentDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentDownloadUrlResponse setBody(GetDocumentDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
