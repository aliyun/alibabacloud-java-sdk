// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServerInstancesResponseBody body;

    public static DescribeServerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerInstancesResponse self = new DescribeServerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerInstancesResponse setBody(DescribeServerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerInstancesResponseBody getBody() {
        return this.body;
    }

}
