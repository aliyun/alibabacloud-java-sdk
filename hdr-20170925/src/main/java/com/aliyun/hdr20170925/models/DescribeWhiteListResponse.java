// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWhiteListResponseBody body;

    public static DescribeWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListResponse self = new DescribeWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteListResponse setBody(DescribeWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteListResponseBody getBody() {
        return this.body;
    }

}
