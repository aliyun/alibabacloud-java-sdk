// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGDeploymentStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSDGDeploymentStatusResponseBody body;

    public static DescribeSDGDeploymentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGDeploymentStatusResponse self = new DescribeSDGDeploymentStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDGDeploymentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDGDeploymentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSDGDeploymentStatusResponse setBody(DescribeSDGDeploymentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDGDeploymentStatusResponseBody getBody() {
        return this.body;
    }

}
