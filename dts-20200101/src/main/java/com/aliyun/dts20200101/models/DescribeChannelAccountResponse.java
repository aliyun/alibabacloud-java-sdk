// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeChannelAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelAccountResponseBody body;

    public static DescribeChannelAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelAccountResponse self = new DescribeChannelAccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelAccountResponse setBody(DescribeChannelAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelAccountResponseBody getBody() {
        return this.body;
    }

}
