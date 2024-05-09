// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToImageJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertPdfToImageJobResponseBody body;

    public static SubmitConvertPdfToImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToImageJobResponse self = new SubmitConvertPdfToImageJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertPdfToImageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertPdfToImageJobResponse setBody(SubmitConvertPdfToImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertPdfToImageJobResponseBody getBody() {
        return this.body;
    }

}
