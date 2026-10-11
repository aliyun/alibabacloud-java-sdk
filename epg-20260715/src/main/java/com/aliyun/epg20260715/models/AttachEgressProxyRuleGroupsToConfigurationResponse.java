// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class AttachEgressProxyRuleGroupsToConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachEgressProxyRuleGroupsToConfigurationResponseBody body;

    public static AttachEgressProxyRuleGroupsToConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachEgressProxyRuleGroupsToConfigurationResponse self = new AttachEgressProxyRuleGroupsToConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public AttachEgressProxyRuleGroupsToConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachEgressProxyRuleGroupsToConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachEgressProxyRuleGroupsToConfigurationResponse setBody(AttachEgressProxyRuleGroupsToConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachEgressProxyRuleGroupsToConfigurationResponseBody getBody() {
        return this.body;
    }

}
