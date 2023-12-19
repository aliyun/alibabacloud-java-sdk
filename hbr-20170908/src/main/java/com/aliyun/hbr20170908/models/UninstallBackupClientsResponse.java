// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UninstallBackupClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallBackupClientsResponseBody body;

    public static UninstallBackupClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientsResponse self = new UninstallBackupClientsResponse();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallBackupClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallBackupClientsResponse setBody(UninstallBackupClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallBackupClientsResponseBody getBody() {
        return this.body;
    }

}
