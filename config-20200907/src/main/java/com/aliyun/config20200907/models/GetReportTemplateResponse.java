// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetReportTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReportTemplateResponseBody body;

    public static GetReportTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateResponse self = new GetReportTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReportTemplateResponse setBody(GetReportTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportTemplateResponseBody getBody() {
        return this.body;
    }

}
