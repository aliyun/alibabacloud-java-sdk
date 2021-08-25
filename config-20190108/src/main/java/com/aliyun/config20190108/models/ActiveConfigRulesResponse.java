// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActiveConfigRulesResponseBody body;

    public static ActiveConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveConfigRulesResponse self = new ActiveConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public ActiveConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveConfigRulesResponse setBody(ActiveConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveConfigRulesResponseBody getBody() {
        return this.body;
    }

}
