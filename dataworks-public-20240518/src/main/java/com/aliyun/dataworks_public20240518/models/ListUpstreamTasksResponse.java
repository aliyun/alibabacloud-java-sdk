// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListUpstreamTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUpstreamTasksResponseBody body;

    public static ListUpstreamTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUpstreamTasksResponse self = new ListUpstreamTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListUpstreamTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUpstreamTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUpstreamTasksResponse setBody(ListUpstreamTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUpstreamTasksResponseBody getBody() {
        return this.body;
    }

}
