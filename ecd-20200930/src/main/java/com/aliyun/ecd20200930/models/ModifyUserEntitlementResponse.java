// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyUserEntitlementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserEntitlementResponseBody body;

    public static ModifyUserEntitlementResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserEntitlementResponse self = new ModifyUserEntitlementResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserEntitlementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserEntitlementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserEntitlementResponse setBody(ModifyUserEntitlementResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserEntitlementResponseBody getBody() {
        return this.body;
    }

}
