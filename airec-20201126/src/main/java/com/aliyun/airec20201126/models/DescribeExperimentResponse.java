// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExperimentResponseBody body;

    public static DescribeExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExperimentResponse self = new DescribeExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExperimentResponse setBody(DescribeExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExperimentResponseBody getBody() {
        return this.body;
    }

}
