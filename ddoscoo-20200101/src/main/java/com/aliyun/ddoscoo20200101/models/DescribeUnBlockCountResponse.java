// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUnBlockCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUnBlockCountResponseBody body;

    public static DescribeUnBlockCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnBlockCountResponse self = new DescribeUnBlockCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnBlockCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnBlockCountResponse setBody(DescribeUnBlockCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnBlockCountResponseBody getBody() {
        return this.body;
    }

}
