// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyEntitlementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEntitlementResponseBody body;

    public static ModifyEntitlementResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEntitlementResponse self = new ModifyEntitlementResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEntitlementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEntitlementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEntitlementResponse setBody(ModifyEntitlementResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEntitlementResponseBody getBody() {
        return this.body;
    }

}
