// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListWorkflowInstantencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkflowInstantencesResponseBody body;

    public static ListWorkflowInstantencesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstantencesResponse self = new ListWorkflowInstantencesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstantencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowInstantencesResponse setBody(ListWorkflowInstantencesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowInstantencesResponseBody getBody() {
        return this.body;
    }

}
