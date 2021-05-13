// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkResponseBody body;

    public static DeleteNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkResponse self = new DeleteNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkResponse setBody(DeleteNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkResponseBody getBody() {
        return this.body;
    }

}
