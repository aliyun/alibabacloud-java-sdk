// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConfigHistoryResponseBody body;

    public static DescribeConfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigHistoryResponse self = new DescribeConfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConfigHistoryResponse setBody(DescribeConfigHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigHistoryResponseBody getBody() {
        return this.body;
    }

}
