// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SubmitDocumentImportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocumentImportJobResponseBody body;

    public static SubmitDocumentImportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentImportJobResponse self = new SubmitDocumentImportJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentImportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocumentImportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocumentImportJobResponse setBody(SubmitDocumentImportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocumentImportJobResponseBody getBody() {
        return this.body;
    }

}
