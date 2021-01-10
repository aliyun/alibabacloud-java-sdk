// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListMediaWorkflowExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListMediaWorkflowExecutionsResponse setBody(ListMediaWorkflowExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaWorkflowExecutionsResponseBody getBody() {
        return this.body;
    }

}
