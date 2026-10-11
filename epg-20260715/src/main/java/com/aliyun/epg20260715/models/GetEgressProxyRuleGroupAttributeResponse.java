// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyRuleGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEgressProxyRuleGroupAttributeResponseBody body;

    public static GetEgressProxyRuleGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyRuleGroupAttributeResponse self = new GetEgressProxyRuleGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyRuleGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEgressProxyRuleGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEgressProxyRuleGroupAttributeResponse setBody(GetEgressProxyRuleGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEgressProxyRuleGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
