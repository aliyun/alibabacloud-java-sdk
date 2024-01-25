// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiHistoryResponseBody body;

    public static DescribeApiHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiHistoryResponse self = new DescribeApiHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiHistoryResponse setBody(DescribeApiHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiHistoryResponseBody getBody() {
        return this.body;
    }

}
