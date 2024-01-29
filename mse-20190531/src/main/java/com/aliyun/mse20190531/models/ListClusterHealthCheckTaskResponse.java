// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterHealthCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterHealthCheckTaskResponseBody body;

    public static ListClusterHealthCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHealthCheckTaskResponse self = new ListClusterHealthCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterHealthCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterHealthCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterHealthCheckTaskResponse setBody(ListClusterHealthCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterHealthCheckTaskResponseBody getBody() {
        return this.body;
    }

}
