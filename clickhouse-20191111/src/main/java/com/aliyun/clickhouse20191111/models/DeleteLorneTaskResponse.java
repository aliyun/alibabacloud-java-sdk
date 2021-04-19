// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteLorneTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLorneTaskResponseBody body;

    public static DeleteLorneTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLorneTaskResponse self = new DeleteLorneTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLorneTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLorneTaskResponse setBody(DeleteLorneTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLorneTaskResponseBody getBody() {
        return this.body;
    }

}
