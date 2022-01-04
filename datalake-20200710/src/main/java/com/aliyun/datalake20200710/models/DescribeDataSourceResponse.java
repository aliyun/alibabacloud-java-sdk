// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataSourceResponseBody body;

    public static DescribeDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceResponse self = new DescribeDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourceResponse setBody(DescribeDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourceResponseBody getBody() {
        return this.body;
    }

}
