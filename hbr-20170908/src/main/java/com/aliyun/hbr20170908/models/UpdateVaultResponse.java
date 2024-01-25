// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateVaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVaultResponseBody body;

    public static UpdateVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVaultResponse self = new UpdateVaultResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVaultResponse setBody(UpdateVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVaultResponseBody getBody() {
        return this.body;
    }

}
