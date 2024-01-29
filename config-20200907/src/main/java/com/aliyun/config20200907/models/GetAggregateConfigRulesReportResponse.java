// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRulesReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateConfigRulesReportResponseBody body;

    public static GetAggregateConfigRulesReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRulesReportResponse self = new GetAggregateConfigRulesReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRulesReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateConfigRulesReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateConfigRulesReportResponse setBody(GetAggregateConfigRulesReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateConfigRulesReportResponseBody getBody() {
        return this.body;
    }

}
