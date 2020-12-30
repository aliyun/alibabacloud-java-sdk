// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTableListByTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTableListByTypeResponseBody body;

    public static DescribeTableListByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableListByTypeResponse self = new DescribeTableListByTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableListByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableListByTypeResponse setBody(DescribeTableListByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableListByTypeResponseBody getBody() {
        return this.body;
    }

}
