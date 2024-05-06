// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CloseBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseBackupResponseBody body;

    public static CloseBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseBackupResponse self = new CloseBackupResponse();
        return TeaModel.build(map, self);
    }

    public CloseBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseBackupResponse setBody(CloseBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseBackupResponseBody getBody() {
        return this.body;
    }

}
