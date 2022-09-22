// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentConvertResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDocumentConvertResultResponseBody body;

    public static GetDocumentConvertResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentConvertResultResponse self = new GetDocumentConvertResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocumentConvertResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocumentConvertResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocumentConvertResultResponse setBody(GetDocumentConvertResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocumentConvertResultResponseBody getBody() {
        return this.body;
    }

}
