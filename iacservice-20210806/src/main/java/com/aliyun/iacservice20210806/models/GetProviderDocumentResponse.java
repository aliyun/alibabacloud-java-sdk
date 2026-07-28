// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProviderDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProviderDocumentResponseBody body;

    public static GetProviderDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProviderDocumentResponse self = new GetProviderDocumentResponse();
        return TeaModel.build(map, self);
    }

    public GetProviderDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProviderDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProviderDocumentResponse setBody(GetProviderDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProviderDocumentResponseBody getBody() {
        return this.body;
    }

}
