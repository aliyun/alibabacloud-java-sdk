// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventBusinessMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventBusinessMetricListResponseBody body;

    public static GetEventBusinessMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventBusinessMetricListResponse self = new GetEventBusinessMetricListResponse();
        return TeaModel.build(map, self);
    }

    public GetEventBusinessMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventBusinessMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventBusinessMetricListResponse setBody(GetEventBusinessMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventBusinessMetricListResponseBody getBody() {
        return this.body;
    }

}
