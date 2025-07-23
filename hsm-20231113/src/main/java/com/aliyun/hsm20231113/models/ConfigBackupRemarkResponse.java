// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigBackupRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigBackupRemarkResponseBody body;

    public static ConfigBackupRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigBackupRemarkResponse self = new ConfigBackupRemarkResponse();
        return TeaModel.build(map, self);
    }

    public ConfigBackupRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigBackupRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigBackupRemarkResponse setBody(ConfigBackupRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigBackupRemarkResponseBody getBody() {
        return this.body;
    }

}
