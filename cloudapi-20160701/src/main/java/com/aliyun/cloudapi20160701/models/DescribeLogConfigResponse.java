// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogConfigResponseBody body;

    public static DescribeLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogConfigResponse self = new DescribeLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogConfigResponse setBody(DescribeLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogConfigResponseBody getBody() {
        return this.body;
    }

}
