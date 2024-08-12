// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetFilterDocumentListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFilterDocumentListResponseBody body;

    public static GetFilterDocumentListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFilterDocumentListResponse self = new GetFilterDocumentListResponse();
        return TeaModel.build(map, self);
    }

    public GetFilterDocumentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFilterDocumentListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFilterDocumentListResponse setBody(GetFilterDocumentListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFilterDocumentListResponseBody getBody() {
        return this.body;
    }

}
