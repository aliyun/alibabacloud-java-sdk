// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopWorkflowInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopWorkflowInstancesResponseBody body;

    public static StopWorkflowInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopWorkflowInstancesResponse self = new StopWorkflowInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StopWorkflowInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopWorkflowInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopWorkflowInstancesResponse setBody(StopWorkflowInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopWorkflowInstancesResponseBody getBody() {
        return this.body;
    }

}
