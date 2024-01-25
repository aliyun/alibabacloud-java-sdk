// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
