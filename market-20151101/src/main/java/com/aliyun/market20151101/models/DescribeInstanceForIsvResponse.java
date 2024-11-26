// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstanceForIsvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceForIsvResponseBody body;

    public static DescribeInstanceForIsvResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceForIsvResponse self = new DescribeInstanceForIsvResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceForIsvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceForIsvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceForIsvResponse setBody(DescribeInstanceForIsvResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceForIsvResponseBody getBody() {
        return this.body;
    }

}
