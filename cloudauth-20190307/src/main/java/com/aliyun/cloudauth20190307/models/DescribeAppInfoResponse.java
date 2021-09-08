// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppInfoResponseBody body;

    public static DescribeAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInfoResponse self = new DescribeAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppInfoResponse setBody(DescribeAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppInfoResponseBody getBody() {
        return this.body;
    }

}
