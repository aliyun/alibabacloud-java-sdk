// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocumentExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocumentExtractJobResponseBody body;

    public static SubmitDocumentExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentExtractJobResponse self = new SubmitDocumentExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocumentExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocumentExtractJobResponse setBody(SubmitDocumentExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocumentExtractJobResponseBody getBody() {
        return this.body;
    }

}
