// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeKeyPairsResponseBody body;

    public static DescribeKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponse self = new DescribeKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKeyPairsResponse setBody(DescribeKeyPairsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKeyPairsResponseBody getBody() {
        return this.body;
    }

}
