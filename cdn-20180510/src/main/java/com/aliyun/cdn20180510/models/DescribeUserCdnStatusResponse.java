// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserCdnStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserCdnStatusResponseBody body;

    public static DescribeUserCdnStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCdnStatusResponse self = new DescribeUserCdnStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserCdnStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserCdnStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserCdnStatusResponse setBody(DescribeUserCdnStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserCdnStatusResponseBody getBody() {
        return this.body;
    }

}
