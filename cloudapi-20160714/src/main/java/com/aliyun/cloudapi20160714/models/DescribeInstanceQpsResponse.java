// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceQpsResponseBody body;

    public static DescribeInstanceQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceQpsResponse self = new DescribeInstanceQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceQpsResponse setBody(DescribeInstanceQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceQpsResponseBody getBody() {
        return this.body;
    }

}
