// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageSupportInstanceTypesResponseBody body;

    public static DescribeImageSupportInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSupportInstanceTypesResponse self = new DescribeImageSupportInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSupportInstanceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageSupportInstanceTypesResponse setBody(DescribeImageSupportInstanceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageSupportInstanceTypesResponseBody getBody() {
        return this.body;
    }

}
