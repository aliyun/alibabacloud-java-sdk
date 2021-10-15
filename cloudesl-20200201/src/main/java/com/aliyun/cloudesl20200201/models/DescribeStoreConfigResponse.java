// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoreConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStoreConfigResponseBody body;

    public static DescribeStoreConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoreConfigResponse self = new DescribeStoreConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoreConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoreConfigResponse setBody(DescribeStoreConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoreConfigResponseBody getBody() {
        return this.body;
    }

}
