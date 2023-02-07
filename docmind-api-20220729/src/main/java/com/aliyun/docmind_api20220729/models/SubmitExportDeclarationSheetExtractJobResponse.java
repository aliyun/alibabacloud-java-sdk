// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitExportDeclarationSheetExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitExportDeclarationSheetExtractJobResponseBody body;

    public static SubmitExportDeclarationSheetExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitExportDeclarationSheetExtractJobResponse self = new SubmitExportDeclarationSheetExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitExportDeclarationSheetExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitExportDeclarationSheetExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitExportDeclarationSheetExtractJobResponse setBody(SubmitExportDeclarationSheetExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitExportDeclarationSheetExtractJobResponseBody getBody() {
        return this.body;
    }

}
