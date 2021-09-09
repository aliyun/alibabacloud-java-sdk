// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDataTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataTaskResponseBody body;

    public static DeleteDataTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataTaskResponse self = new DeleteDataTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataTaskResponse setBody(DeleteDataTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataTaskResponseBody getBody() {
        return this.body;
    }

}
