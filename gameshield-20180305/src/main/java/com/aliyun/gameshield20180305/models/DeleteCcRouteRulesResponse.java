// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DeleteCcRouteRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCcRouteRulesResponseBody body;

    public static DeleteCcRouteRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCcRouteRulesResponse self = new DeleteCcRouteRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCcRouteRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCcRouteRulesResponse setBody(DeleteCcRouteRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCcRouteRulesResponseBody getBody() {
        return this.body;
    }

}
