// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupHttpCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupHttpCodeResponseBody body;

    public static DescribeGroupHttpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupHttpCodeResponse self = new DescribeGroupHttpCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupHttpCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupHttpCodeResponse setBody(DescribeGroupHttpCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupHttpCodeResponseBody getBody() {
        return this.body;
    }

}
