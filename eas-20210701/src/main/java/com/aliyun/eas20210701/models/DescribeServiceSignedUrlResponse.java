// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceSignedUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceSignedUrlResponseBody body;

    public static DescribeServiceSignedUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceSignedUrlResponse self = new DescribeServiceSignedUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceSignedUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceSignedUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceSignedUrlResponse setBody(DescribeServiceSignedUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceSignedUrlResponseBody getBody() {
        return this.body;
    }

}
