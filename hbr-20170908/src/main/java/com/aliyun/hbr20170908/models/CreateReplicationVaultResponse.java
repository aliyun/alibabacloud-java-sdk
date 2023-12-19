// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateReplicationVaultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateReplicationVaultResponseBody body;

    public static CreateReplicationVaultResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationVaultResponse self = new CreateReplicationVaultResponse();
        return TeaModel.build(map, self);
    }

    public CreateReplicationVaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReplicationVaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReplicationVaultResponse setBody(CreateReplicationVaultResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReplicationVaultResponseBody getBody() {
        return this.body;
    }

}
