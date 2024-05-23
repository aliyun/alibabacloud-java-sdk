// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeCapacityHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCapacityHistoryResponseBody body;

    public static DescribeCapacityHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityHistoryResponse self = new DescribeCapacityHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCapacityHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCapacityHistoryResponse setBody(DescribeCapacityHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapacityHistoryResponseBody getBody() {
        return this.body;
    }

}
