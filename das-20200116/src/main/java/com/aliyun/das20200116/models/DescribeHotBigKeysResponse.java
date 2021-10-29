// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotBigKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHotBigKeysResponseBody body;

    public static DescribeHotBigKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotBigKeysResponse self = new DescribeHotBigKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHotBigKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHotBigKeysResponse setBody(DescribeHotBigKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHotBigKeysResponseBody getBody() {
        return this.body;
    }

}
