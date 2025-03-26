// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourceByCenterPolicyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceByCenterPolicyIdResponseBody body;

    public static DescribeResourceByCenterPolicyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByCenterPolicyIdResponse self = new DescribeResourceByCenterPolicyIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByCenterPolicyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceByCenterPolicyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceByCenterPolicyIdResponse setBody(DescribeResourceByCenterPolicyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceByCenterPolicyIdResponseBody getBody() {
        return this.body;
    }

}
