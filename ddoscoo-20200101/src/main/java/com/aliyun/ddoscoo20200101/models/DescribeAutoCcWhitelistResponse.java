// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoCcWhitelistResponseBody body;

    public static DescribeAutoCcWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcWhitelistResponse self = new DescribeAutoCcWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoCcWhitelistResponse setBody(DescribeAutoCcWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

}
