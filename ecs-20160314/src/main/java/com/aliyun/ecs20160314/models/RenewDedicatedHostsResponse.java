// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class RenewDedicatedHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenewDedicatedHostsResponseBody body;

    public static RenewDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewDedicatedHostsResponse self = new RenewDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public RenewDedicatedHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewDedicatedHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewDedicatedHostsResponse setBody(RenewDedicatedHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewDedicatedHostsResponseBody getBody() {
        return this.body;
    }

}
