// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeContactPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContactPointsResponseBody body;

    public static DescribeContactPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactPointsResponse self = new DescribeContactPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContactPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContactPointsResponse setBody(DescribeContactPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContactPointsResponseBody getBody() {
        return this.body;
    }

}
