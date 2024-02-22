// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertLogCountResponseBody body;

    public static DescribeAlertLogCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogCountResponse self = new DescribeAlertLogCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertLogCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertLogCountResponse setBody(DescribeAlertLogCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertLogCountResponseBody getBody() {
        return this.body;
    }

}
