// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSecurityPracticeReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountSecurityPracticeReportResponseBody body;

    public static GetAccountSecurityPracticeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSecurityPracticeReportResponse self = new GetAccountSecurityPracticeReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountSecurityPracticeReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountSecurityPracticeReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountSecurityPracticeReportResponse setBody(GetAccountSecurityPracticeReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountSecurityPracticeReportResponseBody getBody() {
        return this.body;
    }

}
