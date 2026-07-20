// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class VerifyCatalogKmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyCatalogKmsResponseBody body;

    public static VerifyCatalogKmsResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCatalogKmsResponse self = new VerifyCatalogKmsResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCatalogKmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCatalogKmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyCatalogKmsResponse setBody(VerifyCatalogKmsResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCatalogKmsResponseBody getBody() {
        return this.body;
    }

}
