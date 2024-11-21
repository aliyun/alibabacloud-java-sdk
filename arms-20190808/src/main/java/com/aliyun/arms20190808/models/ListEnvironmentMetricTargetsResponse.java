// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentMetricTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentMetricTargetsResponseBody body;

    public static ListEnvironmentMetricTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentMetricTargetsResponse self = new ListEnvironmentMetricTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentMetricTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentMetricTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentMetricTargetsResponse setBody(ListEnvironmentMetricTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentMetricTargetsResponseBody getBody() {
        return this.body;
    }

}
