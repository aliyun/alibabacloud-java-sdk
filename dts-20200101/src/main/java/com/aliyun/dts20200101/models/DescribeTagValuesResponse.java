// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeTagValuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagValuesResponseBody body;

    public static DescribeTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValuesResponse self = new DescribeTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagValuesResponse setBody(DescribeTagValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagValuesResponseBody getBody() {
        return this.body;
    }

}
