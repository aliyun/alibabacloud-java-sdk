// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyReservedInstancesResponseBody body;

    public static ModifyReservedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstancesResponse self = new ModifyReservedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReservedInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReservedInstancesResponse setBody(ModifyReservedInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReservedInstancesResponseBody getBody() {
        return this.body;
    }

}
