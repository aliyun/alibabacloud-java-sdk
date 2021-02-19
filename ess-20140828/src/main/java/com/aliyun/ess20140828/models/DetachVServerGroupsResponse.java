// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachVServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachVServerGroupsResponseBody body;

    public static DetachVServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachVServerGroupsResponse self = new DetachVServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DetachVServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachVServerGroupsResponse setBody(DetachVServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachVServerGroupsResponseBody getBody() {
        return this.body;
    }

}
