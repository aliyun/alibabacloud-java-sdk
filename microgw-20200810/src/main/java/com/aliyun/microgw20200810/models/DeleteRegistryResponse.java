// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class DeleteRegistryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRegistryResponseBody body;

    public static DeleteRegistryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistryResponse self = new DeleteRegistryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRegistryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRegistryResponse setBody(DeleteRegistryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRegistryResponseBody getBody() {
        return this.body;
    }

}
