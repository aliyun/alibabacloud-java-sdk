// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribePhoneInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePhoneInfoResponseBody body;

    public static DescribePhoneInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneInfoResponse self = new DescribePhoneInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhoneInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePhoneInfoResponse setBody(DescribePhoneInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePhoneInfoResponseBody getBody() {
        return this.body;
    }

}
