// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseClassSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVirtualWareHouseClassSetResponseBody body;

    public static DescribeVirtualWareHouseClassSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseClassSetResponse self = new DescribeVirtualWareHouseClassSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseClassSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualWareHouseClassSetResponse setBody(DescribeVirtualWareHouseClassSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualWareHouseClassSetResponseBody getBody() {
        return this.body;
    }

}
