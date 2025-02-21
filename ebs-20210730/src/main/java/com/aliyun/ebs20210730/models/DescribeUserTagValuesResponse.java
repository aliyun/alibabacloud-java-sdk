// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeUserTagValuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserTagValuesResponseBody body;

    public static DescribeUserTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagValuesResponse self = new DescribeUserTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserTagValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserTagValuesResponse setBody(DescribeUserTagValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserTagValuesResponseBody getBody() {
        return this.body;
    }

}
