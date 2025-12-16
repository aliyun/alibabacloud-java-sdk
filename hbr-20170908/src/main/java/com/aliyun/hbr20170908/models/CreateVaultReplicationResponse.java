// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateVaultReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVaultReplicationResponseBody body;

    public static CreateVaultReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVaultReplicationResponse self = new CreateVaultReplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateVaultReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVaultReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVaultReplicationResponse setBody(CreateVaultReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVaultReplicationResponseBody getBody() {
        return this.body;
    }

}
