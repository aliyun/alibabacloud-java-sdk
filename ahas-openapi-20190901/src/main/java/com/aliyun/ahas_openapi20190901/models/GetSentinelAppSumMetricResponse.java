// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetSentinelAppSumMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSentinelAppSumMetricResponseBody body;

    public static GetSentinelAppSumMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelAppSumMetricResponse self = new GetSentinelAppSumMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetSentinelAppSumMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSentinelAppSumMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSentinelAppSumMetricResponse setBody(GetSentinelAppSumMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSentinelAppSumMetricResponseBody getBody() {
        return this.body;
    }

}
