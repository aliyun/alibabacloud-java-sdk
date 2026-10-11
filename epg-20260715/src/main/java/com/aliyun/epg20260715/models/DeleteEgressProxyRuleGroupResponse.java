// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEgressProxyRuleGroupResponseBody body;

    public static DeleteEgressProxyRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyRuleGroupResponse self = new DeleteEgressProxyRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEgressProxyRuleGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEgressProxyRuleGroupResponse setBody(DeleteEgressProxyRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEgressProxyRuleGroupResponseBody getBody() {
        return this.body;
    }

}
