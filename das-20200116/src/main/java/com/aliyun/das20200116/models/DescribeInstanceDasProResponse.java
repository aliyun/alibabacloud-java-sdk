// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeInstanceDasProResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceDasProResponseBody body;

    public static DescribeInstanceDasProResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDasProResponse self = new DescribeInstanceDasProResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDasProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceDasProResponse setBody(DescribeInstanceDasProResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceDasProResponseBody getBody() {
        return this.body;
    }

}
