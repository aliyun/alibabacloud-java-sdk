// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSpaceResponseBody body;

    public static DescribeSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpaceResponse self = new DescribeSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSpaceResponse setBody(DescribeSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSpaceResponseBody getBody() {
        return this.body;
    }

}
