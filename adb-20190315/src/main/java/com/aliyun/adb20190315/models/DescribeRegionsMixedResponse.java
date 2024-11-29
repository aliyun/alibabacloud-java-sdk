// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeRegionsMixedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRegionsMixedResponseBody body;

    public static DescribeRegionsMixedResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsMixedResponse self = new DescribeRegionsMixedResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsMixedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionsMixedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRegionsMixedResponse setBody(DescribeRegionsMixedResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionsMixedResponseBody getBody() {
        return this.body;
    }

}
