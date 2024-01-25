// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneModelsResponseBody body;

    public static DescribeSceneModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneModelsResponse self = new DescribeSceneModelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneModelsResponse setBody(DescribeSceneModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneModelsResponseBody getBody() {
        return this.body;
    }

}
