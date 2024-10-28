// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDownstreamTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDownstreamTasksResponseBody body;

    public static ListDownstreamTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDownstreamTasksResponse self = new ListDownstreamTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDownstreamTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDownstreamTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDownstreamTasksResponse setBody(ListDownstreamTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDownstreamTasksResponseBody getBody() {
        return this.body;
    }

}
