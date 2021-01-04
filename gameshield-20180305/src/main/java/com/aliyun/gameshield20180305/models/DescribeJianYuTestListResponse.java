// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeJianYuTestListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJianYuTestListResponseBody body;

    public static DescribeJianYuTestListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJianYuTestListResponse self = new DescribeJianYuTestListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJianYuTestListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJianYuTestListResponse setBody(DescribeJianYuTestListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJianYuTestListResponseBody getBody() {
        return this.body;
    }

}
