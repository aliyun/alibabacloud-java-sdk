// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DetachEgressProxyRuleGroupsFromConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachEgressProxyRuleGroupsFromConfigurationResponseBody body;

    public static DetachEgressProxyRuleGroupsFromConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachEgressProxyRuleGroupsFromConfigurationResponse self = new DetachEgressProxyRuleGroupsFromConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DetachEgressProxyRuleGroupsFromConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachEgressProxyRuleGroupsFromConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachEgressProxyRuleGroupsFromConfigurationResponse setBody(DetachEgressProxyRuleGroupsFromConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachEgressProxyRuleGroupsFromConfigurationResponseBody getBody() {
        return this.body;
    }

}
