// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeEIURangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEIURangeResponseBody body;

    public static DescribeEIURangeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEIURangeResponse self = new DescribeEIURangeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEIURangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEIURangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEIURangeResponse setBody(DescribeEIURangeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEIURangeResponseBody getBody() {
        return this.body;
    }

}
