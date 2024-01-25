// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiSignaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiSignaturesResponseBody body;

    public static DescribeApiSignaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiSignaturesResponse self = new DescribeApiSignaturesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiSignaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiSignaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiSignaturesResponse setBody(DescribeApiSignaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiSignaturesResponseBody getBody() {
        return this.body;
    }

}
