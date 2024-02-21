// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSubscriptionInstanceAlertResponseBody body;

    public static DescribeSubscriptionInstanceAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstanceAlertResponse self = new DescribeSubscriptionInstanceAlertResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstanceAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSubscriptionInstanceAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSubscriptionInstanceAlertResponse setBody(DescribeSubscriptionInstanceAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionInstanceAlertResponseBody getBody() {
        return this.body;
    }

}
