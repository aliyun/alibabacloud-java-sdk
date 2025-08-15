// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeUserAlertCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserAlertCountResponseBody body;

    public static DescribeUserAlertCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAlertCountResponse self = new DescribeUserAlertCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAlertCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAlertCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserAlertCountResponse setBody(DescribeUserAlertCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAlertCountResponseBody getBody() {
        return this.body;
    }

}
