// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class ReplaceCcRouteRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceCcRouteRulesResponseBody body;

    public static ReplaceCcRouteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCcRouteRulesResponse self = new ReplaceCcRouteRulesResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceCcRouteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceCcRouteRulesResponse setBody(ReplaceCcRouteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceCcRouteRulesResponseBody getBody() {
        return this.body;
    }

}
