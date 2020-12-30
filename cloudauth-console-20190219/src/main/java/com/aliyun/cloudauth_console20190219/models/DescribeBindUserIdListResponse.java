// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeBindUserIdListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBindUserIdListResponseBody body;

    public static DescribeBindUserIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindUserIdListResponse self = new DescribeBindUserIdListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBindUserIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBindUserIdListResponse setBody(DescribeBindUserIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBindUserIdListResponseBody getBody() {
        return this.body;
    }

}
