// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeSecurityWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityWhiteListResponseBody body;

    public static DescribeSecurityWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityWhiteListResponse self = new DescribeSecurityWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityWhiteListResponse setBody(DescribeSecurityWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityWhiteListResponseBody getBody() {
        return this.body;
    }

}
