// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedeployDedicatedHostResponseBody body;

    public static RedeployDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        RedeployDedicatedHostResponse self = new RedeployDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public RedeployDedicatedHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedeployDedicatedHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedeployDedicatedHostResponse setBody(RedeployDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public RedeployDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
