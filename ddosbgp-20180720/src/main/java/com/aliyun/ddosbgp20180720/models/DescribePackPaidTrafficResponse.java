// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackPaidTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePackPaidTrafficResponseBody body;

    public static DescribePackPaidTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackPaidTrafficResponse self = new DescribePackPaidTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackPaidTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackPaidTrafficResponse setBody(DescribePackPaidTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackPaidTrafficResponseBody getBody() {
        return this.body;
    }

}
