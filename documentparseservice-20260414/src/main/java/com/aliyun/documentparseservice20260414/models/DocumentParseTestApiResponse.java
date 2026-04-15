// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentparseservice20260414.models;

import com.aliyun.tea.*;

public class DocumentParseTestApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocumentParseTestApiResponseBody body;

    public static DocumentParseTestApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseTestApiResponse self = new DocumentParseTestApiResponse();
        return TeaModel.build(map, self);
    }

    public DocumentParseTestApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocumentParseTestApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocumentParseTestApiResponse setBody(DocumentParseTestApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DocumentParseTestApiResponseBody getBody() {
        return this.body;
    }

}
