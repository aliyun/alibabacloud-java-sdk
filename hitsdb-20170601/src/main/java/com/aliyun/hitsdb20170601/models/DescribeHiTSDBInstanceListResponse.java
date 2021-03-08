// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeHiTSDBInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHiTSDBInstanceListResponseBody body;

    public static DescribeHiTSDBInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiTSDBInstanceListResponse self = new DescribeHiTSDBInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHiTSDBInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHiTSDBInstanceListResponse setBody(DescribeHiTSDBInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHiTSDBInstanceListResponseBody getBody() {
        return this.body;
    }

}
