// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneModelDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneModelDetailResponseBody body;

    public static DescribeSceneModelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneModelDetailResponse self = new DescribeSceneModelDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneModelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneModelDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneModelDetailResponse setBody(DescribeSceneModelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneModelDetailResponseBody getBody() {
        return this.body;
    }

}
