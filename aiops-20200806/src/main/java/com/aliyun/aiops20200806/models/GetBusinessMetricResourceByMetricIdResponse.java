// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessMetricResourceByMetricIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessMetricResourceByMetricIdResponseBody body;

    public static GetBusinessMetricResourceByMetricIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessMetricResourceByMetricIdResponse self = new GetBusinessMetricResourceByMetricIdResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessMetricResourceByMetricIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessMetricResourceByMetricIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessMetricResourceByMetricIdResponse setBody(GetBusinessMetricResourceByMetricIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessMetricResourceByMetricIdResponseBody getBody() {
        return this.body;
    }

}
