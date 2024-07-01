// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkSQLEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillSparkSQLEngineResponseBody body;

    public static KillSparkSQLEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        KillSparkSQLEngineResponse self = new KillSparkSQLEngineResponse();
        return TeaModel.build(map, self);
    }

    public KillSparkSQLEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillSparkSQLEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillSparkSQLEngineResponse setBody(KillSparkSQLEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public KillSparkSQLEngineResponseBody getBody() {
        return this.body;
    }

}
