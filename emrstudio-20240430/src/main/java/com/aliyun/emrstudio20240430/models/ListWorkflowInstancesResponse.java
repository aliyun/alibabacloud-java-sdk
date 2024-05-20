// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListWorkflowInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowInstancesResponseBody body;

    public static ListWorkflowInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstancesResponse self = new ListWorkflowInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowInstancesResponse setBody(ListWorkflowInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowInstancesResponseBody getBody() {
        return this.body;
    }

}
