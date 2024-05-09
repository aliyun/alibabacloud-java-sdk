// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocumentCompareJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocumentCompareJobResponseBody body;

    public static SubmitDocumentCompareJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentCompareJobResponse self = new SubmitDocumentCompareJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentCompareJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocumentCompareJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocumentCompareJobResponse setBody(SubmitDocumentCompareJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocumentCompareJobResponseBody getBody() {
        return this.body;
    }

}
