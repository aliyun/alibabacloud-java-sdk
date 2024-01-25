// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficControlsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiTrafficControlsResponseBody body;

    public static DescribeApiTrafficControlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficControlsResponse self = new DescribeApiTrafficControlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficControlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiTrafficControlsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiTrafficControlsResponse setBody(DescribeApiTrafficControlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiTrafficControlsResponseBody getBody() {
        return this.body;
    }

}
