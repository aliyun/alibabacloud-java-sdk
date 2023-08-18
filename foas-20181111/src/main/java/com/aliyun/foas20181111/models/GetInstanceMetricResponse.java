// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceMetricResponseBody body;

    public static GetInstanceMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricResponse self = new GetInstanceMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceMetricResponse setBody(GetInstanceMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceMetricResponseBody getBody() {
        return this.body;
    }

}
