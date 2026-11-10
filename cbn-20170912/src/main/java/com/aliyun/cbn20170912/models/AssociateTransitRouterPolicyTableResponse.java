// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterPolicyTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateTransitRouterPolicyTableResponseBody body;

    public static AssociateTransitRouterPolicyTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterPolicyTableResponse self = new AssociateTransitRouterPolicyTableResponse();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterPolicyTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateTransitRouterPolicyTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateTransitRouterPolicyTableResponse setBody(AssociateTransitRouterPolicyTableResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateTransitRouterPolicyTableResponseBody getBody() {
        return this.body;
    }

}
