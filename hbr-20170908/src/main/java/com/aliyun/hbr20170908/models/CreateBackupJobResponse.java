// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateBackupJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBackupJobResponseBody body;

    public static CreateBackupJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupJobResponse self = new CreateBackupJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackupJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBackupJobResponse setBody(CreateBackupJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupJobResponseBody getBody() {
        return this.body;
    }

}
