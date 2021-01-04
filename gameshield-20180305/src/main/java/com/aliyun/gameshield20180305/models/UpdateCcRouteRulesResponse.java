// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcRouteRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCcRouteRulesResponseBody body;

    public static UpdateCcRouteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcRouteRulesResponse self = new UpdateCcRouteRulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCcRouteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCcRouteRulesResponse setBody(UpdateCcRouteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCcRouteRulesResponseBody getBody() {
        return this.body;
    }

}
