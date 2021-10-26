// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModelsResponseBody body;

    public static DescribeModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelsResponse self = new DescribeModelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelsResponse setBody(DescribeModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelsResponseBody getBody() {
        return this.body;
    }

}
