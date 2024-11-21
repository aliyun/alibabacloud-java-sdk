// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAlertRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertRuleResponseBody body;

    public static GetAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRuleResponse self = new GetAlertRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertRuleResponse setBody(GetAlertRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertRuleResponseBody getBody() {
        return this.body;
    }

}
