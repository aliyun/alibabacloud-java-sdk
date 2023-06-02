// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitSalesConfirmationExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSalesConfirmationExtractJobResponseBody body;

    public static SubmitSalesConfirmationExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSalesConfirmationExtractJobResponse self = new SubmitSalesConfirmationExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSalesConfirmationExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSalesConfirmationExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSalesConfirmationExtractJobResponse setBody(SubmitSalesConfirmationExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSalesConfirmationExtractJobResponseBody getBody() {
        return this.body;
    }

}
