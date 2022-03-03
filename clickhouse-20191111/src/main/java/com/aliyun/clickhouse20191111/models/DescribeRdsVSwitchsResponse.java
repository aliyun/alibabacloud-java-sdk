// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRdsVSwitchsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRdsVSwitchsResponse setBody(DescribeRdsVSwitchsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsVSwitchsResponseBody getBody() {
        return this.body;
    }

}
