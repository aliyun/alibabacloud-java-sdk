// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAccountingReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountingReportResponseBody body;

    public static GetAccountingReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountingReportResponse self = new GetAccountingReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountingReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountingReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountingReportResponse setBody(GetAccountingReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountingReportResponseBody getBody() {
        return this.body;
    }

}
