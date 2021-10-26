// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisBySignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApisBySignatureResponseBody body;

    public static DescribeApisBySignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisBySignatureResponse self = new DescribeApisBySignatureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisBySignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisBySignatureResponse setBody(DescribeApisBySignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisBySignatureResponseBody getBody() {
        return this.body;
    }

}
