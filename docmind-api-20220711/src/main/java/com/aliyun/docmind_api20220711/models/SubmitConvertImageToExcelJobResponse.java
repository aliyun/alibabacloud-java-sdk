// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToExcelJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertImageToExcelJobResponseBody body;

    public static SubmitConvertImageToExcelJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToExcelJobResponse self = new SubmitConvertImageToExcelJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToExcelJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertImageToExcelJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertImageToExcelJobResponse setBody(SubmitConvertImageToExcelJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertImageToExcelJobResponseBody getBody() {
        return this.body;
    }

}
