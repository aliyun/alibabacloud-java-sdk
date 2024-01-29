// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachVServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachVServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachVServerGroupsResponse setBody(DetachVServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachVServerGroupsResponseBody getBody() {
        return this.body;
    }

}
