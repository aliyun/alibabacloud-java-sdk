// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeploymentJobResponseBody body;

    public static DescribeDeploymentJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentJobResponse self = new DescribeDeploymentJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeploymentJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeploymentJobResponse setBody(DescribeDeploymentJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeploymentJobResponseBody getBody() {
        return this.body;
    }

}
