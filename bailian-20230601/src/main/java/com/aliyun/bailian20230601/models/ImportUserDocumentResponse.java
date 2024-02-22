// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ImportUserDocumentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportUserDocumentResponseBody body;

    public static ImportUserDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportUserDocumentResponse self = new ImportUserDocumentResponse();
        return TeaModel.build(map, self);
    }

    public ImportUserDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportUserDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportUserDocumentResponse setBody(ImportUserDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportUserDocumentResponseBody getBody() {
        return this.body;
    }

}
