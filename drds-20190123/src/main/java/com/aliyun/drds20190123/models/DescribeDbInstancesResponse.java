// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDbInstancesResponseBody body;

    public static DescribeDbInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstancesResponse self = new DescribeDbInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbInstancesResponse setBody(DescribeDbInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbInstancesResponseBody getBody() {
        return this.body;
    }

}
