// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeChildInstanceRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChildInstanceRegionsResponseBody body;

    public static DescribeChildInstanceRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChildInstanceRegionsResponse self = new DescribeChildInstanceRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChildInstanceRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChildInstanceRegionsResponse setBody(DescribeChildInstanceRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChildInstanceRegionsResponseBody getBody() {
        return this.body;
    }

}
