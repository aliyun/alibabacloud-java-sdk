// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetNotebookTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNotebookTaskStatusResponseBody body;

    public static GetNotebookTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotebookTaskStatusResponse self = new GetNotebookTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetNotebookTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotebookTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNotebookTaskStatusResponse setBody(GetNotebookTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotebookTaskStatusResponseBody getBody() {
        return this.body;
    }

}
