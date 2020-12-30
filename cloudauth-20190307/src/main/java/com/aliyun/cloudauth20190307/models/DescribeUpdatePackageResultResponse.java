// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUpdatePackageResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUpdatePackageResultResponseBody body;

    public static DescribeUpdatePackageResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdatePackageResultResponse self = new DescribeUpdatePackageResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpdatePackageResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpdatePackageResultResponse setBody(DescribeUpdatePackageResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpdatePackageResultResponseBody getBody() {
        return this.body;
    }

}
