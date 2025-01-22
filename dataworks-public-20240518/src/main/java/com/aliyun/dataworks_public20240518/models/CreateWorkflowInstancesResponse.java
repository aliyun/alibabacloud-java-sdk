// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkflowInstancesResponseBody body;

    public static CreateWorkflowInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowInstancesResponse self = new CreateWorkflowInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkflowInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkflowInstancesResponse setBody(CreateWorkflowInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkflowInstancesResponseBody getBody() {
        return this.body;
    }

}
