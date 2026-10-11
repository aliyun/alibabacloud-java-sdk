// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEgressProxyRuleGroupResponseBody body;

    public static CreateEgressProxyRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyRuleGroupResponse self = new CreateEgressProxyRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEgressProxyRuleGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEgressProxyRuleGroupResponse setBody(CreateEgressProxyRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEgressProxyRuleGroupResponseBody getBody() {
        return this.body;
    }

}
