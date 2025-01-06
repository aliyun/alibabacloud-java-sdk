// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetLocalityRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLocalityRuleResponseBody body;

    public static GetLocalityRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLocalityRuleResponse self = new GetLocalityRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetLocalityRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLocalityRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLocalityRuleResponse setBody(GetLocalityRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLocalityRuleResponseBody getBody() {
        return this.body;
    }

}
