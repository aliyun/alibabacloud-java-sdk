// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteReportTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReportTemplateResponseBody body;

    public static DeleteReportTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportTemplateResponse self = new DeleteReportTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReportTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReportTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReportTemplateResponse setBody(DeleteReportTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReportTemplateResponseBody getBody() {
        return this.body;
    }

}
