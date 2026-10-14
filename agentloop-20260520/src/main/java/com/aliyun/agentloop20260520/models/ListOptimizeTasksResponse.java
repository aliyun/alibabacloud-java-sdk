// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListOptimizeTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOptimizeTasksResponseBody body;

    public static ListOptimizeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOptimizeTasksResponse self = new ListOptimizeTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListOptimizeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOptimizeTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOptimizeTasksResponse setBody(ListOptimizeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOptimizeTasksResponseBody getBody() {
        return this.body;
    }

}
