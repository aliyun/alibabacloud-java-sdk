// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeHiTSDBInstanceSecurityIpListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHiTSDBInstanceSecurityIpListResponseBody body;

    public static DescribeHiTSDBInstanceSecurityIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiTSDBInstanceSecurityIpListResponse self = new DescribeHiTSDBInstanceSecurityIpListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHiTSDBInstanceSecurityIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHiTSDBInstanceSecurityIpListResponse setBody(DescribeHiTSDBInstanceSecurityIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHiTSDBInstanceSecurityIpListResponseBody getBody() {
        return this.body;
    }

}
