// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RerunWorkflowInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RerunWorkflowInstancesResponseBody body;

    public static RerunWorkflowInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunWorkflowInstancesResponse self = new RerunWorkflowInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RerunWorkflowInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunWorkflowInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerunWorkflowInstancesResponse setBody(RerunWorkflowInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunWorkflowInstancesResponseBody getBody() {
        return this.body;
    }

}
