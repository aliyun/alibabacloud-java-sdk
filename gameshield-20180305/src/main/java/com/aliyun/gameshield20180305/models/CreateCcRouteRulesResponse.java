// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateCcRouteRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCcRouteRulesResponseBody body;

    public static CreateCcRouteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCcRouteRulesResponse self = new CreateCcRouteRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateCcRouteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCcRouteRulesResponse setBody(CreateCcRouteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCcRouteRulesResponseBody getBody() {
        return this.body;
    }

}
