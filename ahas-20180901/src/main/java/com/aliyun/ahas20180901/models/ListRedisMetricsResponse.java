// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListRedisMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRedisMetricsResponseBody body;

    public static ListRedisMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRedisMetricsResponse self = new ListRedisMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListRedisMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRedisMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRedisMetricsResponse setBody(ListRedisMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRedisMetricsResponseBody getBody() {
        return this.body;
    }

}
