// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLumaDocumentResponseBody body;

    public static GetLumaDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLumaDocumentResponse self = new GetLumaDocumentResponse();
        return TeaModel.build(map, self);
    }

    public GetLumaDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLumaDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLumaDocumentResponse setBody(GetLumaDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLumaDocumentResponseBody getBody() {
        return this.body;
    }

}
