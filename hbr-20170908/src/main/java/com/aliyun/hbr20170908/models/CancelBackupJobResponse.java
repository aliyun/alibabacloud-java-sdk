// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CancelBackupJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelBackupJobResponseBody body;

    public static CancelBackupJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelBackupJobResponse self = new CancelBackupJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelBackupJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelBackupJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelBackupJobResponse setBody(CancelBackupJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelBackupJobResponseBody getBody() {
        return this.body;
    }

}
