// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToWordJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertPdfToWordJobResponseBody body;

    public static SubmitConvertPdfToWordJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToWordJobResponse self = new SubmitConvertPdfToWordJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToWordJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertPdfToWordJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertPdfToWordJobResponse setBody(SubmitConvertPdfToWordJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertPdfToWordJobResponseBody getBody() {
        return this.body;
    }

}
