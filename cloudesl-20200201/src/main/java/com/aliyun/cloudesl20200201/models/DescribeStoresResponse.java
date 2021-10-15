// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStoresResponseBody body;

    public static DescribeStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoresResponse self = new DescribeStoresResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoresResponse setBody(DescribeStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoresResponseBody getBody() {
        return this.body;
    }

}
