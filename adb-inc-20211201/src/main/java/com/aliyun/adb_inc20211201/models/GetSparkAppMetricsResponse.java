// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkAppMetricsResponseBody body;

    public static GetSparkAppMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppMetricsResponse self = new GetSparkAppMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkAppMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkAppMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkAppMetricsResponse setBody(GetSparkAppMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkAppMetricsResponseBody getBody() {
        return this.body;
    }

}
