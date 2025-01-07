// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetAutoScalingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoScalingRuleResponseBody body;

    public static GetAutoScalingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingRuleResponse self = new GetAutoScalingRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoScalingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoScalingRuleResponse setBody(GetAutoScalingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoScalingRuleResponseBody getBody() {
        return this.body;
    }

}
