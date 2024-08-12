// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDocumentListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocumentListResponseBody body;

    public static GetDocumentListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentListResponse self = new GetDocumentListResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentListResponse setBody(GetDocumentListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentListResponseBody getBody() {
        return this.body;
    }

}
