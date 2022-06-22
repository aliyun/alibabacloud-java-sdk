// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ReloadMetricActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReloadMetricActivityResponseBody body;

    public static ReloadMetricActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        ReloadMetricActivityResponse self = new ReloadMetricActivityResponse();
        return TeaModel.build(map, self);
    }

    public ReloadMetricActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReloadMetricActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReloadMetricActivityResponse setBody(ReloadMetricActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public ReloadMetricActivityResponseBody getBody() {
        return this.body;
    }

}
