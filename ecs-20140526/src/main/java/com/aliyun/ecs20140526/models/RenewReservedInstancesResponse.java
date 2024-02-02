// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewReservedInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewReservedInstancesResponseBody body;

    public static RenewReservedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewReservedInstancesResponse self = new RenewReservedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RenewReservedInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewReservedInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewReservedInstancesResponse setBody(RenewReservedInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewReservedInstancesResponseBody getBody() {
        return this.body;
    }

}
