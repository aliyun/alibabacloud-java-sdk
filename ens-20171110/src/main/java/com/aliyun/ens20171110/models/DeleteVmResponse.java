// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteVmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVmResponseBody body;

    public static DeleteVmResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVmResponse self = new DeleteVmResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVmResponse setBody(DeleteVmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVmResponseBody getBody() {
        return this.body;
    }

}
