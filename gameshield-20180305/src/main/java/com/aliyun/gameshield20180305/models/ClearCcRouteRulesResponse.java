// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class ClearCcRouteRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClearCcRouteRulesResponseBody body;

    public static ClearCcRouteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearCcRouteRulesResponse self = new ClearCcRouteRulesResponse();
        return TeaModel.build(map, self);
    }

    public ClearCcRouteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearCcRouteRulesResponse setBody(ClearCcRouteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearCcRouteRulesResponseBody getBody() {
        return this.body;
    }

}
