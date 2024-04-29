// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DeleteSandboxInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSandboxInstanceResponseBody body;

    public static DeleteSandboxInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSandboxInstanceResponse self = new DeleteSandboxInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSandboxInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSandboxInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSandboxInstanceResponse setBody(DeleteSandboxInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSandboxInstanceResponseBody getBody() {
        return this.body;
    }

}
