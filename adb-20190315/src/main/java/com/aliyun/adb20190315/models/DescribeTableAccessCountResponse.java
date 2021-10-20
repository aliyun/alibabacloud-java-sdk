// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableAccessCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTableAccessCountResponseBody body;

    public static DescribeTableAccessCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableAccessCountResponse self = new DescribeTableAccessCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTableAccessCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTableAccessCountResponse setBody(DescribeTableAccessCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTableAccessCountResponseBody getBody() {
        return this.body;
    }

}
