// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class BillingStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BillingStatisticsResponseBody body;

    public static BillingStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingStatisticsResponse self = new BillingStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public BillingStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingStatisticsResponse setBody(BillingStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingStatisticsResponseBody getBody() {
        return this.body;
    }

}
