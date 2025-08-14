// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListWorkflowTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowTasksResponseBody body;

    public static ListWorkflowTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTasksResponse self = new ListWorkflowTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowTasksResponse setBody(ListWorkflowTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowTasksResponseBody getBody() {
        return this.body;
    }

}
