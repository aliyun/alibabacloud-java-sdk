// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDedicatedHostClusterResponseBody body;

    public static CreateDedicatedHostClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostClusterResponse self = new CreateDedicatedHostClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedHostClusterResponse setBody(CreateDedicatedHostClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedHostClusterResponseBody getBody() {
        return this.body;
    }

}
