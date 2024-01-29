// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class OrderClusterHealthCheckRiskNoticeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OrderClusterHealthCheckRiskNoticeResponseBody body;

    public static OrderClusterHealthCheckRiskNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderClusterHealthCheckRiskNoticeResponse self = new OrderClusterHealthCheckRiskNoticeResponse();
        return TeaModel.build(map, self);
    }

    public OrderClusterHealthCheckRiskNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderClusterHealthCheckRiskNoticeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderClusterHealthCheckRiskNoticeResponse setBody(OrderClusterHealthCheckRiskNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderClusterHealthCheckRiskNoticeResponseBody getBody() {
        return this.body;
    }

}
