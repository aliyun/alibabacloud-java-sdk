// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiTrafficResponseBody body;

    public static DescribeApiTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficResponse self = new DescribeApiTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiTrafficResponse setBody(DescribeApiTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiTrafficResponseBody getBody() {
        return this.body;
    }

}
