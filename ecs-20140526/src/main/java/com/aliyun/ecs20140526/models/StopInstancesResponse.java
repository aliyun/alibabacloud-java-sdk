// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopInstancesResponseBody body;

    public static StopInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponse self = new StopInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StopInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopInstancesResponse setBody(StopInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopInstancesResponseBody getBody() {
        return this.body;
    }

}
