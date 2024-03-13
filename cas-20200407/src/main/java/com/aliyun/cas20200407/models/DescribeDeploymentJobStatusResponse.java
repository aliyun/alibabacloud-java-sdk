// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeploymentJobStatusResponseBody body;

    public static DescribeDeploymentJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentJobStatusResponse self = new DescribeDeploymentJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeploymentJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeploymentJobStatusResponse setBody(DescribeDeploymentJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeploymentJobStatusResponseBody getBody() {
        return this.body;
    }

}
