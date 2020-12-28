// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RedeployDedicatedHostResponse setBody(RedeployDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public RedeployDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
