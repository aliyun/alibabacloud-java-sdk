// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeAutoScalingHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoScalingHistoryResponseBody body;

    public static DescribeAutoScalingHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScalingHistoryResponse self = new DescribeAutoScalingHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScalingHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoScalingHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoScalingHistoryResponse setBody(DescribeAutoScalingHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoScalingHistoryResponseBody getBody() {
        return this.body;
    }

}
