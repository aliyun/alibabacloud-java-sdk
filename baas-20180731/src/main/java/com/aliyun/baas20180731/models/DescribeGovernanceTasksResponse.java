// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeGovernanceTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGovernanceTasksResponseBody body;

    public static DescribeGovernanceTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGovernanceTasksResponse self = new DescribeGovernanceTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGovernanceTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGovernanceTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGovernanceTasksResponse setBody(DescribeGovernanceTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGovernanceTasksResponseBody getBody() {
        return this.body;
    }

}
