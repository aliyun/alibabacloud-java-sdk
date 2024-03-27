// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class ListWorkflowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowsResponseBody body;

    public static ListWorkflowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowsResponse self = new ListWorkflowsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowsResponse setBody(ListWorkflowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowsResponseBody getBody() {
        return this.body;
    }

}
