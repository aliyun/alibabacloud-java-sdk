// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDedicatedHostAutoRenewAttributeResponseBody body;

    public static ModifyDedicatedHostAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAutoRenewAttributeResponse self = new ModifyDedicatedHostAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDedicatedHostAutoRenewAttributeResponse setBody(ModifyDedicatedHostAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDedicatedHostAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
