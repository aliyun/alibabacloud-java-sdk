// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAdviceServiceEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdviceServiceEnabledResponseBody body;

    public static DescribeAdviceServiceEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdviceServiceEnabledResponse self = new DescribeAdviceServiceEnabledResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdviceServiceEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdviceServiceEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdviceServiceEnabledResponse setBody(DescribeAdviceServiceEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdviceServiceEnabledResponseBody getBody() {
        return this.body;
    }

}
