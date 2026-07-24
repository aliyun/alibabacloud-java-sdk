// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeInstancesResponseBody body;

    public static ListComputeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeInstancesResponse self = new ListComputeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeInstancesResponse setBody(ListComputeInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeInstancesResponseBody getBody() {
        return this.body;
    }

}
