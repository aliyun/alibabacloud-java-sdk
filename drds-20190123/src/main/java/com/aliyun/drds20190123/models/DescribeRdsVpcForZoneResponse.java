// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsVpcForZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRdsVpcForZoneResponseBody body;

    public static DescribeRdsVpcForZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVpcForZoneResponse self = new DescribeRdsVpcForZoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVpcForZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdsVpcForZoneResponse setBody(DescribeRdsVpcForZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdsVpcForZoneResponseBody getBody() {
        return this.body;
    }

}
