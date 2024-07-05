// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListMediaWorkflowExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaWorkflowExecutionsResponseBody body;

    public static ListMediaWorkflowExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaWorkflowExecutionsResponse self = new ListMediaWorkflowExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaWorkflowExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaWorkflowExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaWorkflowExecutionsResponse setBody(ListMediaWorkflowExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaWorkflowExecutionsResponseBody getBody() {
        return this.body;
    }

}
