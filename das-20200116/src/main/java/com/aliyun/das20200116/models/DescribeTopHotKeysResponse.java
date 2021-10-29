// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopHotKeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTopHotKeysResponseBody body;

    public static DescribeTopHotKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopHotKeysResponse self = new DescribeTopHotKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopHotKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopHotKeysResponse setBody(DescribeTopHotKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopHotKeysResponseBody getBody() {
        return this.body;
    }

}
