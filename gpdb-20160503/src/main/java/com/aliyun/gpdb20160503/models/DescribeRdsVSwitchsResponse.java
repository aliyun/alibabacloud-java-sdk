// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRdsVSwitchsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRdsVSwitchsResponseBody body;

    public static DescribeRdsVSwitchsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVSwitchsResponse self = new DescribeRdsVSwitchsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVSwitchsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsVSwitchsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdsVSwitchsResponse setBody(DescribeRdsVSwitchsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsVSwitchsResponseBody getBody() {
        return this.body;
    }

}
