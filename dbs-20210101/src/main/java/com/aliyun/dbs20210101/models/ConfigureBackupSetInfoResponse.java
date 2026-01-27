// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ConfigureBackupSetInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigureBackupSetInfoResponseBody body;

    public static ConfigureBackupSetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigureBackupSetInfoResponse self = new ConfigureBackupSetInfoResponse();
        return TeaModel.build(map, self);
    }

    public ConfigureBackupSetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigureBackupSetInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigureBackupSetInfoResponse setBody(ConfigureBackupSetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigureBackupSetInfoResponseBody getBody() {
        return this.body;
    }

}
