// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopTaskInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTaskInstancesResponseBody body;

    public static StopTaskInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTaskInstancesResponse self = new StopTaskInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StopTaskInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTaskInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTaskInstancesResponse setBody(StopTaskInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTaskInstancesResponseBody getBody() {
        return this.body;
    }

}
