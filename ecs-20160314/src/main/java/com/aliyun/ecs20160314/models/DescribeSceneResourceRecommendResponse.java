// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeSceneResourceRecommendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSceneResourceRecommendResponseBody body;

    public static DescribeSceneResourceRecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneResourceRecommendResponse self = new DescribeSceneResourceRecommendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneResourceRecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneResourceRecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneResourceRecommendResponse setBody(DescribeSceneResourceRecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneResourceRecommendResponseBody getBody() {
        return this.body;
    }

}
