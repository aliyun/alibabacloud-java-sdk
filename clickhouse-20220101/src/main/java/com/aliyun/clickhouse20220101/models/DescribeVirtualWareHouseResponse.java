// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVirtualWareHouseResponseBody body;

    public static DescribeVirtualWareHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseResponse self = new DescribeVirtualWareHouseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualWareHouseResponse setBody(DescribeVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
