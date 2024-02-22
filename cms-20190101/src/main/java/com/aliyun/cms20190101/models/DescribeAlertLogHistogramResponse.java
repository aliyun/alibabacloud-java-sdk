// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogHistogramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlertLogHistogramResponseBody body;

    public static DescribeAlertLogHistogramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogHistogramResponse self = new DescribeAlertLogHistogramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogHistogramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertLogHistogramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlertLogHistogramResponse setBody(DescribeAlertLogHistogramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertLogHistogramResponseBody getBody() {
        return this.body;
    }

}
