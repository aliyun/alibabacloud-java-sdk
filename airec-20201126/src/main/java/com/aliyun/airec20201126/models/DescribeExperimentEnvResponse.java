// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeExperimentEnvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExperimentEnvResponseBody body;

    public static DescribeExperimentEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExperimentEnvResponse self = new DescribeExperimentEnvResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExperimentEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExperimentEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExperimentEnvResponse setBody(DescribeExperimentEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExperimentEnvResponseBody getBody() {
        return this.body;
    }

}
