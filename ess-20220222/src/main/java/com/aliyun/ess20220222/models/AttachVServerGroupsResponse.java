// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachVServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachVServerGroupsResponseBody body;

    public static AttachVServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachVServerGroupsResponse self = new AttachVServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AttachVServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachVServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachVServerGroupsResponse setBody(AttachVServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachVServerGroupsResponseBody getBody() {
        return this.body;
    }

}
