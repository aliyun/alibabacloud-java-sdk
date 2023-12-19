// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class InstallBackupClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InstallBackupClientsResponseBody body;

    public static InstallBackupClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallBackupClientsResponse self = new InstallBackupClientsResponse();
        return TeaModel.build(map, self);
    }

    public InstallBackupClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallBackupClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallBackupClientsResponse setBody(InstallBackupClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallBackupClientsResponseBody getBody() {
        return this.body;
    }

}
