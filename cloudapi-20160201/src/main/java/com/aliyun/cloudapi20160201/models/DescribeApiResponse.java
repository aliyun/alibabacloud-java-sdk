// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiResponseBody body;

    public static DescribeApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiResponse self = new DescribeApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiResponse setBody(DescribeApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiResponseBody getBody() {
        return this.body;
    }

}
