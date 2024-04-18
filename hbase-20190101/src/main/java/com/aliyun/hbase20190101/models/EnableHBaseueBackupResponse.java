// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableHBaseueBackupResponseBody body;

    public static EnableHBaseueBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueBackupResponse self = new EnableHBaseueBackupResponse();
        return TeaModel.build(map, self);
    }

    public EnableHBaseueBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableHBaseueBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableHBaseueBackupResponse setBody(EnableHBaseueBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableHBaseueBackupResponseBody getBody() {
        return this.body;
    }

}
