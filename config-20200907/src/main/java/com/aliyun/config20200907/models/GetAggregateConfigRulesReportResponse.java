// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRulesReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAggregateConfigRulesReportResponse setBody(GetAggregateConfigRulesReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateConfigRulesReportResponseBody getBody() {
        return this.body;
    }

}
