// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableEventRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableEventRulesResponse setBody(DisableEventRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableEventRulesResponseBody getBody() {
        return this.body;
    }

}
