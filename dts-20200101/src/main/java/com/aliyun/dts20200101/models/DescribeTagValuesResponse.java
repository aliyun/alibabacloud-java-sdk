// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeTagValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTagValuesResponseBody body;

    public static DescribeTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValuesResponse self = new DescribeTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagValuesResponse setBody(DescribeTagValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagValuesResponseBody getBody() {
        return this.body;
    }

}
