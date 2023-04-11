// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTranslateReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTranslateReportResponseBody body;

    public static GetTranslateReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranslateReportResponse self = new GetTranslateReportResponse();
        return TeaModel.build(map, self);
    }

    public GetTranslateReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranslateReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranslateReportResponse setBody(GetTranslateReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranslateReportResponseBody getBody() {
        return this.body;
    }

}
