// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReActivateInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReActivateInstancesResponseBody body;

    public static ReActivateInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReActivateInstancesResponse self = new ReActivateInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ReActivateInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReActivateInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReActivateInstancesResponse setBody(ReActivateInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReActivateInstancesResponseBody getBody() {
        return this.body;
    }

}
