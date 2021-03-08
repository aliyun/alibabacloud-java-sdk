// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeHiTSDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHiTSDBInstanceResponseBody body;

    public static DescribeHiTSDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiTSDBInstanceResponse self = new DescribeHiTSDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHiTSDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHiTSDBInstanceResponse setBody(DescribeHiTSDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHiTSDBInstanceResponseBody getBody() {
        return this.body;
    }

}
