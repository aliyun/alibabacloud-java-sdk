// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentparseservice20260414.models;

import com.aliyun.tea.*;

public class DocumentParseOnlineApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DocumentParseOnlineApiResponseBody body;

    public static DocumentParseOnlineApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseOnlineApiResponse self = new DocumentParseOnlineApiResponse();
        return TeaModel.build(map, self);
    }

    public DocumentParseOnlineApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DocumentParseOnlineApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DocumentParseOnlineApiResponse setBody(DocumentParseOnlineApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DocumentParseOnlineApiResponseBody getBody() {
        return this.body;
    }

}
