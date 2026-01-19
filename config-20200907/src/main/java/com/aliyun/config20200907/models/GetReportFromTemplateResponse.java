// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetReportFromTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetReportFromTemplateResponseBody body;

    public static GetReportFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportFromTemplateResponse self = new GetReportFromTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetReportFromTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportFromTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReportFromTemplateResponse setBody(GetReportFromTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportFromTemplateResponseBody getBody() {
        return this.body;
    }

}
