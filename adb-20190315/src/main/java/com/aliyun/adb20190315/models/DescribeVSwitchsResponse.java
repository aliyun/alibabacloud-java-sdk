// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeVSwitchsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVSwitchsResponseBody body;

    public static DescribeVSwitchsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchsResponse self = new DescribeVSwitchsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVSwitchsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVSwitchsResponse setBody(DescribeVSwitchsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVSwitchsResponseBody getBody() {
        return this.body;
    }

}
