// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmLogsResponseBody body;

    public static DescribeGtmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmLogsResponse self = new DescribeGtmLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmLogsResponse setBody(DescribeGtmLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmLogsResponseBody getBody() {
        return this.body;
    }

}
