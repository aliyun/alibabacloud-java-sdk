// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class GetAiReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiReportResponseBody body;

    public static GetAiReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiReportResponse self = new GetAiReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAiReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiReportResponse setBody(GetAiReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiReportResponseBody getBody() {
        return this.body;
    }

}
