// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSystemEventCountResponseBody body;

    public static DescribeSystemEventCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventCountResponse self = new DescribeSystemEventCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSystemEventCountResponse setBody(DescribeSystemEventCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSystemEventCountResponseBody getBody() {
        return this.body;
    }

}
