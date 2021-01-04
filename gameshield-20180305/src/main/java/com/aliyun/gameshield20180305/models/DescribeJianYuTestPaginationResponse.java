// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeJianYuTestPaginationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJianYuTestPaginationResponseBody body;

    public static DescribeJianYuTestPaginationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJianYuTestPaginationResponse self = new DescribeJianYuTestPaginationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJianYuTestPaginationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJianYuTestPaginationResponse setBody(DescribeJianYuTestPaginationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJianYuTestPaginationResponseBody getBody() {
        return this.body;
    }

}
