// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityGroupAttributeResponseBody body;

    public static DescribeSecurityGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupAttributeResponse self = new DescribeSecurityGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityGroupAttributeResponse setBody(DescribeSecurityGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
