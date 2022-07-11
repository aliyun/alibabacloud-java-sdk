// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelineExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImagePipelineExecutionsResponseBody body;

    public static DescribeImagePipelineExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelineExecutionsResponse self = new DescribeImagePipelineExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelineExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImagePipelineExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImagePipelineExecutionsResponse setBody(DescribeImagePipelineExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImagePipelineExecutionsResponseBody getBody() {
        return this.body;
    }

}
