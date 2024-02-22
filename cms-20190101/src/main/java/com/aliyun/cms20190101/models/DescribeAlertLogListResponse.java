// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertLogListResponseBody body;

    public static DescribeAlertLogListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogListResponse self = new DescribeAlertLogListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertLogListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertLogListResponse setBody(DescribeAlertLogListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertLogListResponseBody getBody() {
        return this.body;
    }

}
