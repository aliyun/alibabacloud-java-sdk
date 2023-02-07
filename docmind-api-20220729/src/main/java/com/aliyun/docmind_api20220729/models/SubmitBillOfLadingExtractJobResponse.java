// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitBillOfLadingExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitBillOfLadingExtractJobResponseBody body;

    public static SubmitBillOfLadingExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBillOfLadingExtractJobResponse self = new SubmitBillOfLadingExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBillOfLadingExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBillOfLadingExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBillOfLadingExtractJobResponse setBody(SubmitBillOfLadingExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBillOfLadingExtractJobResponseBody getBody() {
        return this.body;
    }

}
