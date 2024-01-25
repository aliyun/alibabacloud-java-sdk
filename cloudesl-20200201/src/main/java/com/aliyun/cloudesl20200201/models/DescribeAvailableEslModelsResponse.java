// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeAvailableEslModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableEslModelsResponseBody body;

    public static DescribeAvailableEslModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableEslModelsResponse self = new DescribeAvailableEslModelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableEslModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableEslModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableEslModelsResponse setBody(DescribeAvailableEslModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableEslModelsResponseBody getBody() {
        return this.body;
    }

}
