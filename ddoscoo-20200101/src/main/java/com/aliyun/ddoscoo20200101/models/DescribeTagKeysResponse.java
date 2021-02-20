// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTagKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTagKeysResponseBody body;

    public static DescribeTagKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysResponse self = new DescribeTagKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagKeysResponse setBody(DescribeTagKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagKeysResponseBody getBody() {
        return this.body;
    }

}
