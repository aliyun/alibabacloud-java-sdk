// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateExplorerTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExplorerTaskResponseBody body;

    public static CreateExplorerTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExplorerTaskResponse self = new CreateExplorerTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateExplorerTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExplorerTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExplorerTaskResponse setBody(CreateExplorerTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExplorerTaskResponseBody getBody() {
        return this.body;
    }

}
