// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpgradeBackupClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeBackupClientsResponseBody body;

    public static UpgradeBackupClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeBackupClientsResponse self = new UpgradeBackupClientsResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeBackupClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeBackupClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeBackupClientsResponse setBody(UpgradeBackupClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeBackupClientsResponseBody getBody() {
        return this.body;
    }

}
