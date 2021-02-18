// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSubscriptionInstanceAlertResponse setBody(DescribeSubscriptionInstanceAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSubscriptionInstanceAlertResponseBody getBody() {
        return this.body;
    }

}
