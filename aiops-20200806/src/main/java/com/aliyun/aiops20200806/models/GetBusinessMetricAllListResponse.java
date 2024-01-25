// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricAllListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessMetricAllListResponseBody body;

    public static GetBusinessMetricAllListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricAllListResponse self = new GetBusinessMetricAllListResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricAllListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessMetricAllListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessMetricAllListResponse setBody(GetBusinessMetricAllListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessMetricAllListResponseBody getBody() {
        return this.body;
    }

}
