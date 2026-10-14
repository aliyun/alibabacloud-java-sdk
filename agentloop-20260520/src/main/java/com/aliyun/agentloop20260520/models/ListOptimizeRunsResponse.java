// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListOptimizeRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOptimizeRunsResponseBody body;

    public static ListOptimizeRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOptimizeRunsResponse self = new ListOptimizeRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListOptimizeRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOptimizeRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOptimizeRunsResponse setBody(ListOptimizeRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOptimizeRunsResponseBody getBody() {
        return this.body;
    }

}
