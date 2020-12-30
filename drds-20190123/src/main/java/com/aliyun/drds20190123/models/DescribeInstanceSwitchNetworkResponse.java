// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceSwitchNetworkResponseBody body;

    public static DescribeInstanceSwitchNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchNetworkResponse self = new DescribeInstanceSwitchNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSwitchNetworkResponse setBody(DescribeInstanceSwitchNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSwitchNetworkResponseBody getBody() {
        return this.body;
    }

}
