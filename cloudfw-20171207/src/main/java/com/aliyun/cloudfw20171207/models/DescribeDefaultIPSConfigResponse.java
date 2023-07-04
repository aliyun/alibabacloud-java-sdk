// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDefaultIPSConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDefaultIPSConfigResponseBody body;

    public static DescribeDefaultIPSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultIPSConfigResponse self = new DescribeDefaultIPSConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultIPSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefaultIPSConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefaultIPSConfigResponse setBody(DescribeDefaultIPSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefaultIPSConfigResponseBody getBody() {
        return this.body;
    }

}
