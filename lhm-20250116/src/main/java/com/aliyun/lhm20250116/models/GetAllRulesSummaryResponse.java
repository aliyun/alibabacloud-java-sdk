// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetAllRulesSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAllRulesSummaryResponseBody body;

    public static GetAllRulesSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllRulesSummaryResponse self = new GetAllRulesSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetAllRulesSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllRulesSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllRulesSummaryResponse setBody(GetAllRulesSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllRulesSummaryResponseBody getBody() {
        return this.body;
    }

}
