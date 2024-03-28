// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndPointTrafficPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody body;

    public static DescribeCustomRoutingEndPointTrafficPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndPointTrafficPolicyResponse self = new DescribeCustomRoutingEndPointTrafficPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyResponse setBody(DescribeCustomRoutingEndPointTrafficPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomRoutingEndPointTrafficPolicyResponseBody getBody() {
        return this.body;
    }

}
