// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeEvaluateDedicatedHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEvaluateDedicatedHostsResponseBody body;

    public static DescribeEvaluateDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluateDedicatedHostsResponse self = new DescribeEvaluateDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluateDedicatedHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEvaluateDedicatedHostsResponse setBody(DescribeEvaluateDedicatedHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEvaluateDedicatedHostsResponseBody getBody() {
        return this.body;
    }

}
