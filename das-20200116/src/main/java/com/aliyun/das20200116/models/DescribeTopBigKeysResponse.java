// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopBigKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopBigKeysResponseBody body;

    public static DescribeTopBigKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopBigKeysResponse self = new DescribeTopBigKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopBigKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopBigKeysResponse setBody(DescribeTopBigKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopBigKeysResponseBody getBody() {
        return this.body;
    }

}
