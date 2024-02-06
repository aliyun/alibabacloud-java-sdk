// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePrePaidInstanceStockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrePaidInstanceStockResponseBody body;

    public static DescribePrePaidInstanceStockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrePaidInstanceStockResponse self = new DescribePrePaidInstanceStockResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrePaidInstanceStockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrePaidInstanceStockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrePaidInstanceStockResponse setBody(DescribePrePaidInstanceStockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrePaidInstanceStockResponseBody getBody() {
        return this.body;
    }

}
