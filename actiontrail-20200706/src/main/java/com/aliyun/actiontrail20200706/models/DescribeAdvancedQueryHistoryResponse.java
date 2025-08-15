// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeAdvancedQueryHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdvancedQueryHistoryResponseBody body;

    public static DescribeAdvancedQueryHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedQueryHistoryResponse self = new DescribeAdvancedQueryHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedQueryHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdvancedQueryHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdvancedQueryHistoryResponse setBody(DescribeAdvancedQueryHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdvancedQueryHistoryResponseBody getBody() {
        return this.body;
    }

}
