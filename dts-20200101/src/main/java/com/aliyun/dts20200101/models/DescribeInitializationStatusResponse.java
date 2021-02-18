// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeInitializationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInitializationStatusResponseBody body;

    public static DescribeInitializationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInitializationStatusResponse self = new DescribeInitializationStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInitializationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInitializationStatusResponse setBody(DescribeInitializationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInitializationStatusResponseBody getBody() {
        return this.body;
    }

}
