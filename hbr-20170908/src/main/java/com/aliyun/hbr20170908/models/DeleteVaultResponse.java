// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteVaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVaultResponseBody body;

    public static DeleteVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVaultResponse self = new DeleteVaultResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVaultResponse setBody(DeleteVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVaultResponseBody getBody() {
        return this.body;
    }

}
