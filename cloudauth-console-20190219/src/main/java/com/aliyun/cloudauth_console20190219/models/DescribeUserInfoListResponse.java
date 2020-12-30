// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUserInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserInfoListResponseBody body;

    public static DescribeUserInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserInfoListResponse self = new DescribeUserInfoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserInfoListResponse setBody(DescribeUserInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserInfoListResponseBody getBody() {
        return this.body;
    }

}
