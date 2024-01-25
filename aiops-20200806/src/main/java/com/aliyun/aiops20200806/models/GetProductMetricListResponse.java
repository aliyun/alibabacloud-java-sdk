// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetProductMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProductMetricListResponseBody body;

    public static GetProductMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductMetricListResponse self = new GetProductMetricListResponse();
        return TeaModel.build(map, self);
    }

    public GetProductMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProductMetricListResponse setBody(GetProductMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductMetricListResponseBody getBody() {
        return this.body;
    }

}
