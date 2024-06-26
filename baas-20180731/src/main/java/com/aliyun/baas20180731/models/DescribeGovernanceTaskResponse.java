// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeGovernanceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGovernanceTaskResponseBody body;

    public static DescribeGovernanceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGovernanceTaskResponse self = new DescribeGovernanceTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGovernanceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGovernanceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGovernanceTaskResponse setBody(DescribeGovernanceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGovernanceTaskResponseBody getBody() {
        return this.body;
    }

}
