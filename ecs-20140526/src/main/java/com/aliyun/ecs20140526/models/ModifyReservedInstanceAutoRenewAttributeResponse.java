// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyReservedInstanceAutoRenewAttributeResponseBody body;

    public static ModifyReservedInstanceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstanceAutoRenewAttributeResponse self = new ModifyReservedInstanceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstanceAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReservedInstanceAutoRenewAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReservedInstanceAutoRenewAttributeResponse setBody(ModifyReservedInstanceAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReservedInstanceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
