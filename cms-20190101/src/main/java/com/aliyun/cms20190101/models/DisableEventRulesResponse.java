// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableEventRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableEventRulesResponseBody body;

    public static DisableEventRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableEventRulesResponse self = new DisableEventRulesResponse();
        return TeaModel.build(map, self);
    }

    public DisableEventRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableEventRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableEventRulesResponse setBody(DisableEventRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableEventRulesResponseBody getBody() {
        return this.body;
    }

}
