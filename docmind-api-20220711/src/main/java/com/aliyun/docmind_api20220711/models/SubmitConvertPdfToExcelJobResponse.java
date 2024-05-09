// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToExcelJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertPdfToExcelJobResponseBody body;

    public static SubmitConvertPdfToExcelJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToExcelJobResponse self = new SubmitConvertPdfToExcelJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToExcelJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertPdfToExcelJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertPdfToExcelJobResponse setBody(SubmitConvertPdfToExcelJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertPdfToExcelJobResponseBody getBody() {
        return this.body;
    }

}
