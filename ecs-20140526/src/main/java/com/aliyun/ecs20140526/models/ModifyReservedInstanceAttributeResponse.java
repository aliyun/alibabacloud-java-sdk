// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyReservedInstanceAttributeResponseBody body;

    public static ModifyReservedInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstanceAttributeResponse self = new ModifyReservedInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReservedInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReservedInstanceAttributeResponse setBody(ModifyReservedInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReservedInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
