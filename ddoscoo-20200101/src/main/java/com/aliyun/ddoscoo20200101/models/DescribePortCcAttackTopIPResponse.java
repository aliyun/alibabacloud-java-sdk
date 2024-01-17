// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortCcAttackTopIPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePortCcAttackTopIPResponseBody body;

    public static DescribePortCcAttackTopIPResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortCcAttackTopIPResponse self = new DescribePortCcAttackTopIPResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortCcAttackTopIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortCcAttackTopIPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortCcAttackTopIPResponse setBody(DescribePortCcAttackTopIPResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortCcAttackTopIPResponseBody getBody() {
        return this.body;
    }

}
