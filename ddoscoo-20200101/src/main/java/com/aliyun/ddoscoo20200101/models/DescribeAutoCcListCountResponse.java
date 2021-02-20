// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAutoCcListCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoCcListCountResponseBody body;

    public static DescribeAutoCcListCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoCcListCountResponse self = new DescribeAutoCcListCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoCcListCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoCcListCountResponse setBody(DescribeAutoCcListCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoCcListCountResponseBody getBody() {
        return this.body;
    }

}
