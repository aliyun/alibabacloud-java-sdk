// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServicesResponseBody body;

    public static DescribeServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServicesResponse self = new DescribeServicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServicesResponse setBody(DescribeServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServicesResponseBody getBody() {
        return this.body;
    }

}
