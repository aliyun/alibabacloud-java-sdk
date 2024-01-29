// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateConfigRulesReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAggregateConfigRulesReportResponseBody body;

    public static GenerateAggregateConfigRulesReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateConfigRulesReportResponse self = new GenerateAggregateConfigRulesReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateConfigRulesReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAggregateConfigRulesReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAggregateConfigRulesReportResponse setBody(GenerateAggregateConfigRulesReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAggregateConfigRulesReportResponseBody getBody() {
        return this.body;
    }

}
