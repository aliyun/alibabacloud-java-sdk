// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitTradeDocumentPackageExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTradeDocumentPackageExtractJobResponseBody body;

    public static SubmitTradeDocumentPackageExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTradeDocumentPackageExtractJobResponse self = new SubmitTradeDocumentPackageExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTradeDocumentPackageExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTradeDocumentPackageExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTradeDocumentPackageExtractJobResponse setBody(SubmitTradeDocumentPackageExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTradeDocumentPackageExtractJobResponseBody getBody() {
        return this.body;
    }

}
