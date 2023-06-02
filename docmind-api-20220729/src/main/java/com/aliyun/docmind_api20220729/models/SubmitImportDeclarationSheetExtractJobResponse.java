// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitImportDeclarationSheetExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitImportDeclarationSheetExtractJobResponseBody body;

    public static SubmitImportDeclarationSheetExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportDeclarationSheetExtractJobResponse self = new SubmitImportDeclarationSheetExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImportDeclarationSheetExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImportDeclarationSheetExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImportDeclarationSheetExtractJobResponse setBody(SubmitImportDeclarationSheetExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImportDeclarationSheetExtractJobResponseBody getBody() {
        return this.body;
    }

}
