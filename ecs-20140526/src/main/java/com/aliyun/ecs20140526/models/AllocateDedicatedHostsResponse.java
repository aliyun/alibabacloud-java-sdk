// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateDedicatedHostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateDedicatedHostsResponseBody body;

    public static AllocateDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateDedicatedHostsResponse self = new AllocateDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public AllocateDedicatedHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateDedicatedHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateDedicatedHostsResponse setBody(AllocateDedicatedHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateDedicatedHostsResponseBody getBody() {
        return this.body;
    }

}
