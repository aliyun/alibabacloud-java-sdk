// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class UpdateInstanceTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceTableResponseBody body;

    public static UpdateInstanceTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceTableResponse self = new UpdateInstanceTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceTableResponse setBody(UpdateInstanceTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceTableResponseBody getBody() {
        return this.body;
    }

}
