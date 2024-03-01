// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInternetDnsLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInternetDnsLogsResponseBody body;

    public static DescribeInternetDnsLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetDnsLogsResponse self = new DescribeInternetDnsLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInternetDnsLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInternetDnsLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInternetDnsLogsResponse setBody(DescribeInternetDnsLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInternetDnsLogsResponseBody getBody() {
        return this.body;
    }

}
