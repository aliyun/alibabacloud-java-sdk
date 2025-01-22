// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecuteAdhocWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAdhocWorkflowInstanceResponseBody body;

    public static ExecuteAdhocWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdhocWorkflowInstanceResponse self = new ExecuteAdhocWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAdhocWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAdhocWorkflowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAdhocWorkflowInstanceResponse setBody(ExecuteAdhocWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAdhocWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
