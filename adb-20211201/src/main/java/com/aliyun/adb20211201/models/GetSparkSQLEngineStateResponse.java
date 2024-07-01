// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkSQLEngineStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkSQLEngineStateResponseBody body;

    public static GetSparkSQLEngineStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSQLEngineStateResponse self = new GetSparkSQLEngineStateResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkSQLEngineStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkSQLEngineStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkSQLEngineStateResponse setBody(GetSparkSQLEngineStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkSQLEngineStateResponseBody getBody() {
        return this.body;
    }

}
