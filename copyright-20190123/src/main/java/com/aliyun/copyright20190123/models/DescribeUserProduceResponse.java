// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DescribeUserProduceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserProduceResponseBody body;

    public static DescribeUserProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProduceResponse self = new DescribeUserProduceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserProduceResponse setBody(DescribeUserProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserProduceResponseBody getBody() {
        return this.body;
    }

}
