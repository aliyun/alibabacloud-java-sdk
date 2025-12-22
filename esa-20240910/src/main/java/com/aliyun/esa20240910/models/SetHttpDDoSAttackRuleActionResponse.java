// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackRuleActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetHttpDDoSAttackRuleActionResponseBody body;

    public static SetHttpDDoSAttackRuleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackRuleActionResponse self = new SetHttpDDoSAttackRuleActionResponse();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackRuleActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHttpDDoSAttackRuleActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetHttpDDoSAttackRuleActionResponse setBody(SetHttpDDoSAttackRuleActionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHttpDDoSAttackRuleActionResponseBody getBody() {
        return this.body;
    }

}
