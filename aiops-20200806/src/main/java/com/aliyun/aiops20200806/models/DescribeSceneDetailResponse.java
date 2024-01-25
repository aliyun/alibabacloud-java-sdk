// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneDetailResponseBody body;

    public static DescribeSceneDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDetailResponse self = new DescribeSceneDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneDetailResponse setBody(DescribeSceneDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneDetailResponseBody getBody() {
        return this.body;
    }

}
