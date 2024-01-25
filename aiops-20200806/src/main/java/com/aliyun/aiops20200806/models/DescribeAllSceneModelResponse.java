// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllSceneModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllSceneModelResponseBody body;

    public static DescribeAllSceneModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllSceneModelResponse self = new DescribeAllSceneModelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllSceneModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllSceneModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllSceneModelResponse setBody(DescribeAllSceneModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllSceneModelResponseBody getBody() {
        return this.body;
    }

}
