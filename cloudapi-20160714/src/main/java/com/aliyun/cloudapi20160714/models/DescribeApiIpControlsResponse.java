// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiIpControlsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiIpControlsResponseBody body;

    public static DescribeApiIpControlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiIpControlsResponse self = new DescribeApiIpControlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiIpControlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiIpControlsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiIpControlsResponse setBody(DescribeApiIpControlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiIpControlsResponseBody getBody() {
        return this.body;
    }

}
