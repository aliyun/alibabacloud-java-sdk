// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartWorkflowInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartWorkflowInstancesResponseBody body;

    public static StartWorkflowInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowInstancesResponse self = new StartWorkflowInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StartWorkflowInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartWorkflowInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartWorkflowInstancesResponse setBody(StartWorkflowInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StartWorkflowInstancesResponseBody getBody() {
        return this.body;
    }

}
