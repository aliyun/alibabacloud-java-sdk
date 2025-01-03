// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListChangeRequestWorkflowExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChangeRequestWorkflowExecutionsResponseBody body;

    public static ListChangeRequestWorkflowExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRequestWorkflowExecutionsResponse self = new ListChangeRequestWorkflowExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListChangeRequestWorkflowExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangeRequestWorkflowExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChangeRequestWorkflowExecutionsResponse setBody(ListChangeRequestWorkflowExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChangeRequestWorkflowExecutionsResponseBody getBody() {
        return this.body;
    }

}
