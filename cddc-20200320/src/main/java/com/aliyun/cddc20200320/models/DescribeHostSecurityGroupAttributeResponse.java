// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeHostSecurityGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHostSecurityGroupAttributeResponseBody body;

    public static DescribeHostSecurityGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostSecurityGroupAttributeResponse self = new DescribeHostSecurityGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostSecurityGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostSecurityGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHostSecurityGroupAttributeResponse setBody(DescribeHostSecurityGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostSecurityGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
