// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricAlertListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessMetricAlertListResponseBody body;

    public static GetBusinessMetricAlertListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricAlertListResponse self = new GetBusinessMetricAlertListResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricAlertListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessMetricAlertListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessMetricAlertListResponse setBody(GetBusinessMetricAlertListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessMetricAlertListResponseBody getBody() {
        return this.body;
    }

}
