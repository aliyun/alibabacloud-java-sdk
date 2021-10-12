// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceSecurityIpsResponseBody body;

    public static DescribeDBInstanceSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSecurityIpsResponse self = new DescribeDBInstanceSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceSecurityIpsResponse setBody(DescribeDBInstanceSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
