// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyRuleGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEgressProxyRuleGroupAttributeResponseBody body;

    public static UpdateEgressProxyRuleGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyRuleGroupAttributeResponse self = new UpdateEgressProxyRuleGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyRuleGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEgressProxyRuleGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEgressProxyRuleGroupAttributeResponse setBody(UpdateEgressProxyRuleGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEgressProxyRuleGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
