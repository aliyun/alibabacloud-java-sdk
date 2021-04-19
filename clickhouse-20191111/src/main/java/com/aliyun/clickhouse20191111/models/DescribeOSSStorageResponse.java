// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeOSSStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOSSStorageResponseBody body;

    public static DescribeOSSStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOSSStorageResponse self = new DescribeOSSStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOSSStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOSSStorageResponse setBody(DescribeOSSStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOSSStorageResponseBody getBody() {
        return this.body;
    }

}
