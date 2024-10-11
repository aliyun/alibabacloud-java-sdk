// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseEndpointInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVirtualWareHouseEndpointInfoResponseBody body;

    public static DescribeVirtualWareHouseEndpointInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseEndpointInfoResponse self = new DescribeVirtualWareHouseEndpointInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseEndpointInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualWareHouseEndpointInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVirtualWareHouseEndpointInfoResponse setBody(DescribeVirtualWareHouseEndpointInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualWareHouseEndpointInfoResponseBody getBody() {
        return this.body;
    }

}
