// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneSystemModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneSystemModelResponseBody body;

    public static DescribeSceneSystemModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneSystemModelResponse self = new DescribeSceneSystemModelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneSystemModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneSystemModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneSystemModelResponse setBody(DescribeSceneSystemModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneSystemModelResponseBody getBody() {
        return this.body;
    }

}
