// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyGrantInstanceToTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGrantInstanceToTransitRouterResponseBody body;

    public static ModifyGrantInstanceToTransitRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGrantInstanceToTransitRouterResponse self = new ModifyGrantInstanceToTransitRouterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGrantInstanceToTransitRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGrantInstanceToTransitRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGrantInstanceToTransitRouterResponse setBody(ModifyGrantInstanceToTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGrantInstanceToTransitRouterResponseBody getBody() {
        return this.body;
    }

}
