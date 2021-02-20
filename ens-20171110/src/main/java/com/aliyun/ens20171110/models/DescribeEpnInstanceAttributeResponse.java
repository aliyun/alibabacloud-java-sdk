// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEpnInstanceAttributeResponseBody body;

    public static DescribeEpnInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstanceAttributeResponse self = new DescribeEpnInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEpnInstanceAttributeResponse setBody(DescribeEpnInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEpnInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
