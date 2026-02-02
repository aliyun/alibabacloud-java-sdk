// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateReportTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateReportTemplateResponseBody body;

    public static UpdateReportTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportTemplateResponse self = new UpdateReportTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateReportTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateReportTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateReportTemplateResponse setBody(UpdateReportTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateReportTemplateResponseBody getBody() {
        return this.body;
    }

}
