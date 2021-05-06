// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBResourcePoolResponseBody body;

    public static DescribeDBResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourcePoolResponse self = new DescribeDBResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBResourcePoolResponse setBody(DescribeDBResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBResourcePoolResponseBody getBody() {
        return this.body;
    }

}
