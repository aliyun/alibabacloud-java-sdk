// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceTrafficResponseBody body;

    public static DescribeInstanceTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTrafficResponse self = new DescribeInstanceTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTrafficResponse setBody(DescribeInstanceTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTrafficResponseBody getBody() {
        return this.body;
    }

}
