// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImagePipelinesResponseBody body;

    public static DescribeImagePipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelinesResponse self = new DescribeImagePipelinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImagePipelinesResponse setBody(DescribeImagePipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImagePipelinesResponseBody getBody() {
        return this.body;
    }

}
