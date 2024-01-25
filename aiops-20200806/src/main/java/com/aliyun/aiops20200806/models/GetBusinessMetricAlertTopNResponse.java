// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricAlertTopNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessMetricAlertTopNResponseBody body;

    public static GetBusinessMetricAlertTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricAlertTopNResponse self = new GetBusinessMetricAlertTopNResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricAlertTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessMetricAlertTopNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessMetricAlertTopNResponse setBody(GetBusinessMetricAlertTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessMetricAlertTopNResponseBody getBody() {
        return this.body;
    }

}
