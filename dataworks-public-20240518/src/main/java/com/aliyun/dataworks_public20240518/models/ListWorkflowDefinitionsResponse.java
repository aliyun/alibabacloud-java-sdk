// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListWorkflowDefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkflowDefinitionsResponseBody body;

    public static ListWorkflowDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowDefinitionsResponse self = new ListWorkflowDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowDefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowDefinitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkflowDefinitionsResponse setBody(ListWorkflowDefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowDefinitionsResponseBody getBody() {
        return this.body;
    }

}
