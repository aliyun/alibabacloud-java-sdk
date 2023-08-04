// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ImportEnterpriseDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportEnterpriseDocumentResponseBody body;

    public static ImportEnterpriseDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportEnterpriseDocumentResponse self = new ImportEnterpriseDocumentResponse();
        return TeaModel.build(map, self);
    }

    public ImportEnterpriseDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportEnterpriseDocumentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportEnterpriseDocumentResponse setBody(ImportEnterpriseDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportEnterpriseDocumentResponseBody getBody() {
        return this.body;
    }

}
