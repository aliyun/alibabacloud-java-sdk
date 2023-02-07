// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitInvoiceExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitInvoiceExtractJobResponseBody body;

    public static SubmitInvoiceExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInvoiceExtractJobResponse self = new SubmitInvoiceExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInvoiceExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitInvoiceExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitInvoiceExtractJobResponse setBody(SubmitInvoiceExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitInvoiceExtractJobResponseBody getBody() {
        return this.body;
    }

}
