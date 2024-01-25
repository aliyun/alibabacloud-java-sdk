// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceSlbConnectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSlbConnectResponseBody body;

    public static DescribeInstanceSlbConnectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSlbConnectResponse self = new DescribeInstanceSlbConnectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSlbConnectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSlbConnectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSlbConnectResponse setBody(DescribeInstanceSlbConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSlbConnectResponseBody getBody() {
        return this.body;
    }

}
