// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAllLocalIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAllLocalIpsResponseBody body;

    public static DescribeAllLocalIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllLocalIpsResponse self = new DescribeAllLocalIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllLocalIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllLocalIpsResponse setBody(DescribeAllLocalIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllLocalIpsResponseBody getBody() {
        return this.body;
    }

}
