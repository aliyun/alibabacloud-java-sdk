// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPolicyTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTransitRouterPolicyTableResponseBody body;

    public static UpdateTransitRouterPolicyTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterPolicyTableResponse self = new UpdateTransitRouterPolicyTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterPolicyTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTransitRouterPolicyTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTransitRouterPolicyTableResponse setBody(UpdateTransitRouterPolicyTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTransitRouterPolicyTableResponseBody getBody() {
        return this.body;
    }

}
