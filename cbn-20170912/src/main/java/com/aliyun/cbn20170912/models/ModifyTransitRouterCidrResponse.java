// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTransitRouterCidrResponseBody body;

    public static ModifyTransitRouterCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCidrResponse self = new ModifyTransitRouterCidrResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTransitRouterCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTransitRouterCidrResponse setBody(ModifyTransitRouterCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTransitRouterCidrResponseBody getBody() {
        return this.body;
    }

}
