// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SuspendTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendTaskInstancesResponseBody body;

    public static SuspendTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendTaskInstancesResponse self = new SuspendTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public SuspendTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendTaskInstancesResponse setBody(SuspendTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
