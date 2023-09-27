// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeApiIpControlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
