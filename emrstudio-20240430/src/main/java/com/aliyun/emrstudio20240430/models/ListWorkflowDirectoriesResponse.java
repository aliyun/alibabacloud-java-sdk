// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListWorkflowDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowDirectoriesResponseBody body;

    public static ListWorkflowDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowDirectoriesResponse self = new ListWorkflowDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowDirectoriesResponse setBody(ListWorkflowDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowDirectoriesResponseBody getBody() {
        return this.body;
    }

}
