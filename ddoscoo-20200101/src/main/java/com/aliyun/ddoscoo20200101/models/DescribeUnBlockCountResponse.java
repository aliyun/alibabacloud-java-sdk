// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeUnBlockCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeUnBlockCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUnBlockCountResponse setBody(DescribeUnBlockCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnBlockCountResponseBody getBody() {
        return this.body;
    }

}
