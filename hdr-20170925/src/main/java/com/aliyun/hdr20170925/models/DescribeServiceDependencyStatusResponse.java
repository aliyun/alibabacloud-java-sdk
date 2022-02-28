// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServiceDependencyStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceDependencyStatusResponseBody body;

    public static DescribeServiceDependencyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDependencyStatusResponse self = new DescribeServiceDependencyStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDependencyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceDependencyStatusResponse setBody(DescribeServiceDependencyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceDependencyStatusResponseBody getBody() {
        return this.body;
    }

}
