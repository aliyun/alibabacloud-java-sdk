// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeStudioLayoutsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStudioLayoutsResponseBody body;

    public static DescribeStudioLayoutsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStudioLayoutsResponse self = new DescribeStudioLayoutsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStudioLayoutsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStudioLayoutsResponse setBody(DescribeStudioLayoutsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStudioLayoutsResponseBody getBody() {
        return this.body;
    }

}
