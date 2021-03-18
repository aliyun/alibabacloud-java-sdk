// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageFromFamilyResponseBody body;

    public static DescribeImageFromFamilyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromFamilyResponse self = new DescribeImageFromFamilyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromFamilyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageFromFamilyResponse setBody(DescribeImageFromFamilyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageFromFamilyResponseBody getBody() {
        return this.body;
    }

}
