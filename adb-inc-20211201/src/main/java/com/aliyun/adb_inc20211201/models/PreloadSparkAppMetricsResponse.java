// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class PreloadSparkAppMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreloadSparkAppMetricsResponseBody body;

    public static PreloadSparkAppMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        PreloadSparkAppMetricsResponse self = new PreloadSparkAppMetricsResponse();
        return TeaModel.build(map, self);
    }

    public PreloadSparkAppMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreloadSparkAppMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreloadSparkAppMetricsResponse setBody(PreloadSparkAppMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public PreloadSparkAppMetricsResponseBody getBody() {
        return this.body;
    }

}
