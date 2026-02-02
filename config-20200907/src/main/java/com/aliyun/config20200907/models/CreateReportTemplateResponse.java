// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateReportTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReportTemplateResponseBody body;

    public static CreateReportTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReportTemplateResponse self = new CreateReportTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateReportTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReportTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReportTemplateResponse setBody(CreateReportTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReportTemplateResponseBody getBody() {
        return this.body;
    }

}
