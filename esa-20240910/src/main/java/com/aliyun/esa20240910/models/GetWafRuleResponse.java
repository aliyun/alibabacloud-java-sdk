// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWafRuleResponseBody body;

    public static GetWafRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWafRuleResponse self = new GetWafRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetWafRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWafRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWafRuleResponse setBody(GetWafRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWafRuleResponseBody getBody() {
        return this.body;
    }

}
