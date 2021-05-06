// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNetInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterNetInfoResponseBody body;

    public static DescribeDBClusterNetInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNetInfoResponse self = new DescribeDBClusterNetInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNetInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterNetInfoResponse setBody(DescribeDBClusterNetInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterNetInfoResponseBody getBody() {
        return this.body;
    }

}
