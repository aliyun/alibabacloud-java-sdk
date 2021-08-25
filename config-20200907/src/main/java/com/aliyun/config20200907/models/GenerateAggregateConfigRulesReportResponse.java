// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateConfigRulesReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GenerateAggregateConfigRulesReportResponse setBody(GenerateAggregateConfigRulesReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAggregateConfigRulesReportResponseBody getBody() {
        return this.body;
    }

}
