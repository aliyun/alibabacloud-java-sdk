// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartSparkSQLEngineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartSparkSQLEngineResponseBody body;

    public static StartSparkSQLEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSparkSQLEngineResponse self = new StartSparkSQLEngineResponse();
        return TeaModel.build(map, self);
    }

    public StartSparkSQLEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSparkSQLEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSparkSQLEngineResponse setBody(StartSparkSQLEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSparkSQLEngineResponseBody getBody() {
        return this.body;
    }

}
