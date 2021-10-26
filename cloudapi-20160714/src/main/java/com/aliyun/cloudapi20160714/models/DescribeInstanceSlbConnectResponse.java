// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceSlbConnectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeInstanceSlbConnectResponse setBody(DescribeInstanceSlbConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSlbConnectResponseBody getBody() {
        return this.body;
    }

}
