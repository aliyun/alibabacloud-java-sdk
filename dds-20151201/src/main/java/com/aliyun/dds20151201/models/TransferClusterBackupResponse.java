// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class TransferClusterBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferClusterBackupResponseBody body;

    public static TransferClusterBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferClusterBackupResponse self = new TransferClusterBackupResponse();
        return TeaModel.build(map, self);
    }

    public TransferClusterBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferClusterBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferClusterBackupResponse setBody(TransferClusterBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferClusterBackupResponseBody getBody() {
        return this.body;
    }

}
