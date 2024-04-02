// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssStockStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssStockStatusResponseBody body;

    public static DescribeOssStockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStockStatusResponse self = new DescribeOssStockStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssStockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssStockStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssStockStatusResponse setBody(DescribeOssStockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssStockStatusResponseBody getBody() {
        return this.body;
    }

}
