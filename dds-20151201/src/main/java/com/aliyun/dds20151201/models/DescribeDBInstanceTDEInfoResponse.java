// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceTDEInfoResponseBody body;

    public static DescribeDBInstanceTDEInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEInfoResponse self = new DescribeDBInstanceTDEInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceTDEInfoResponse setBody(DescribeDBInstanceTDEInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceTDEInfoResponseBody getBody() {
        return this.body;
    }

}
