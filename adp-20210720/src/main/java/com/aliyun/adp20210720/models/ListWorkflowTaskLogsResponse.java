// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListWorkflowTaskLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListWorkflowTaskLogsResponseBody body;

    public static ListWorkflowTaskLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTaskLogsResponse self = new ListWorkflowTaskLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTaskLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkflowTaskLogsResponse setBody(ListWorkflowTaskLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkflowTaskLogsResponseBody getBody() {
        return this.body;
    }

}
