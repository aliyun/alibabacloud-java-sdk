// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogStoreKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogStoreKeysResponseBody body;

    public static DescribeLogStoreKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreKeysResponse self = new DescribeLogStoreKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogStoreKeysResponse setBody(DescribeLogStoreKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogStoreKeysResponseBody getBody() {
        return this.body;
    }

}
