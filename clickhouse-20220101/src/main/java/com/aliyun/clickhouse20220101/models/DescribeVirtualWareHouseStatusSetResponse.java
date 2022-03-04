// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseStatusSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVirtualWareHouseStatusSetResponseBody body;

    public static DescribeVirtualWareHouseStatusSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseStatusSetResponse self = new DescribeVirtualWareHouseStatusSetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseStatusSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualWareHouseStatusSetResponse setBody(DescribeVirtualWareHouseStatusSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualWareHouseStatusSetResponseBody getBody() {
        return this.body;
    }

}
