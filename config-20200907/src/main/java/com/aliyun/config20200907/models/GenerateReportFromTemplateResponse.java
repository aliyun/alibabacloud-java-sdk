// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateReportFromTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateReportFromTemplateResponseBody body;

    public static GenerateReportFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateReportFromTemplateResponse self = new GenerateReportFromTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GenerateReportFromTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateReportFromTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateReportFromTemplateResponse setBody(GenerateReportFromTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateReportFromTemplateResponseBody getBody() {
        return this.body;
    }

}
