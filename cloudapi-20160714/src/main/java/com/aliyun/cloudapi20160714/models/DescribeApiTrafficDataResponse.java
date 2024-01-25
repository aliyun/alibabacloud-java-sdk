// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiTrafficDataResponseBody body;

    public static DescribeApiTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficDataResponse self = new DescribeApiTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiTrafficDataResponse setBody(DescribeApiTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiTrafficDataResponseBody getBody() {
        return this.body;
    }

}
