// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEgressProxyRulesResponseBody body;

    public static CreateEgressProxyRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyRulesResponse self = new CreateEgressProxyRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEgressProxyRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEgressProxyRulesResponse setBody(CreateEgressProxyRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEgressProxyRulesResponseBody getBody() {
        return this.body;
    }

}
