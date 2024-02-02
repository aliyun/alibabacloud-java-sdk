// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateDedicatedHostClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDedicatedHostClusterResponse setBody(CreateDedicatedHostClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedHostClusterResponseBody getBody() {
        return this.body;
    }

}
