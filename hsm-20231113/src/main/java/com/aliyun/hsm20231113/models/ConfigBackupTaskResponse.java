// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigBackupTaskResponseBody body;

    public static ConfigBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigBackupTaskResponse self = new ConfigBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public ConfigBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigBackupTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigBackupTaskResponse setBody(ConfigBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigBackupTaskResponseBody getBody() {
        return this.body;
    }

}
