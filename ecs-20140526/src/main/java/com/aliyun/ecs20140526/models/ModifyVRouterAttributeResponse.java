// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVRouterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVRouterAttributeResponseBody body;

    public static ModifyVRouterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVRouterAttributeResponse self = new ModifyVRouterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVRouterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVRouterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVRouterAttributeResponse setBody(ModifyVRouterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVRouterAttributeResponseBody getBody() {
        return this.body;
    }

}
