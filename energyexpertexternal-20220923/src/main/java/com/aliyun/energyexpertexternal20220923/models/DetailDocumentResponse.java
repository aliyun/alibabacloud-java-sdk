// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class DetailDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetailDocumentResponseBody body;

    public static DetailDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailDocumentResponse self = new DetailDocumentResponse();
        return TeaModel.build(map, self);
    }

    public DetailDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetailDocumentResponse setBody(DetailDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailDocumentResponseBody getBody() {
        return this.body;
    }

}
