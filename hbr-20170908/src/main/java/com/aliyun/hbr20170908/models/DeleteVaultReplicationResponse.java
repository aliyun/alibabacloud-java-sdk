// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteVaultReplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVaultReplicationResponseBody body;

    public static DeleteVaultReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVaultReplicationResponse self = new DeleteVaultReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVaultReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVaultReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVaultReplicationResponse setBody(DeleteVaultReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVaultReplicationResponseBody getBody() {
        return this.body;
    }

}
