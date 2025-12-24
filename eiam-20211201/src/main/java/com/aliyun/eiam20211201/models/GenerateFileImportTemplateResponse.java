// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateFileImportTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateFileImportTemplateResponseBody body;

    public static GenerateFileImportTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileImportTemplateResponse self = new GenerateFileImportTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GenerateFileImportTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateFileImportTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateFileImportTemplateResponse setBody(GenerateFileImportTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateFileImportTemplateResponseBody getBody() {
        return this.body;
    }

}
