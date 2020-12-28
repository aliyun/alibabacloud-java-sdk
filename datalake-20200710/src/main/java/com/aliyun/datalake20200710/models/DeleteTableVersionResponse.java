// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteTableVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTableVersionResponseBody body;

    public static DeleteTableVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableVersionResponse self = new DeleteTableVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTableVersionResponse setBody(DeleteTableVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTableVersionResponseBody getBody() {
        return this.body;
    }

}
