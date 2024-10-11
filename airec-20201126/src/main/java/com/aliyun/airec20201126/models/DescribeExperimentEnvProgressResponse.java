// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeExperimentEnvProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExperimentEnvProgressResponseBody body;

    public static DescribeExperimentEnvProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExperimentEnvProgressResponse self = new DescribeExperimentEnvProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExperimentEnvProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExperimentEnvProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExperimentEnvProgressResponse setBody(DescribeExperimentEnvProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExperimentEnvProgressResponseBody getBody() {
        return this.body;
    }

}
