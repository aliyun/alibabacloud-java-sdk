// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeInstancesInPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeInstancesInPageResponseBody body;

    public static ListComputeInstancesInPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeInstancesInPageResponse self = new ListComputeInstancesInPageResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeInstancesInPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeInstancesInPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeInstancesInPageResponse setBody(ListComputeInstancesInPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeInstancesInPageResponseBody getBody() {
        return this.body;
    }

}
