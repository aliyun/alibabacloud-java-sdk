// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterAttributeResponseBody body;

    public static DescribeDBClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponse self = new DescribeDBClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterAttributeResponse setBody(DescribeDBClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
