// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeDataCentersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataCentersResponseBody body;

    public static DescribeDataCentersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCentersResponse self = new DescribeDataCentersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataCentersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataCentersResponse setBody(DescribeDataCentersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataCentersResponseBody getBody() {
        return this.body;
    }

}
