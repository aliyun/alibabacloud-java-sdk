// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetHttpDDoSAttackRuleStatusResponseBody body;

    public static SetHttpDDoSAttackRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackRuleStatusResponse self = new SetHttpDDoSAttackRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHttpDDoSAttackRuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetHttpDDoSAttackRuleStatusResponse setBody(SetHttpDDoSAttackRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHttpDDoSAttackRuleStatusResponseBody getBody() {
        return this.body;
    }

}
