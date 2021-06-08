// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserLogserviceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserLogserviceStatusResponseBody body;

    public static DescribeUserLogserviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogserviceStatusResponse self = new DescribeUserLogserviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogserviceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLogserviceStatusResponse setBody(DescribeUserLogserviceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLogserviceStatusResponseBody getBody() {
        return this.body;
    }

}
