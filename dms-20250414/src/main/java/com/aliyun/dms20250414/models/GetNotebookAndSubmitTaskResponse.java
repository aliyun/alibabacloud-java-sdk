// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetNotebookAndSubmitTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNotebookAndSubmitTaskResponseBody body;

    public static GetNotebookAndSubmitTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotebookAndSubmitTaskResponse self = new GetNotebookAndSubmitTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetNotebookAndSubmitTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotebookAndSubmitTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNotebookAndSubmitTaskResponse setBody(GetNotebookAndSubmitTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotebookAndSubmitTaskResponseBody getBody() {
        return this.body;
    }

}
