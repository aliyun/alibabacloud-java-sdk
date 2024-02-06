// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlStockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsSaleControlStockResponseBody body;

    public static DescribeEnsSaleControlStockResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlStockResponse self = new DescribeEnsSaleControlStockResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlStockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsSaleControlStockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsSaleControlStockResponse setBody(DescribeEnsSaleControlStockResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsSaleControlStockResponseBody getBody() {
        return this.body;
    }

}
