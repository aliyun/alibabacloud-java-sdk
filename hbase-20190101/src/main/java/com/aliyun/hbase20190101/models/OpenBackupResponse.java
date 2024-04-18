// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class OpenBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenBackupResponseBody body;

    public static OpenBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenBackupResponse self = new OpenBackupResponse();
        return TeaModel.build(map, self);
    }

    public OpenBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenBackupResponse setBody(OpenBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenBackupResponseBody getBody() {
        return this.body;
    }

}
