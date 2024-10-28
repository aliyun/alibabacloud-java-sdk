// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDownstreamTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDownstreamTaskInstancesResponseBody body;

    public static ListDownstreamTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDownstreamTaskInstancesResponse self = new ListDownstreamTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDownstreamTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDownstreamTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDownstreamTaskInstancesResponse setBody(ListDownstreamTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDownstreamTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
