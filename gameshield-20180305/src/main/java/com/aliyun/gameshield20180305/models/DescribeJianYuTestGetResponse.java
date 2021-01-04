// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeJianYuTestGetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeJianYuTestGetResponseBody body;

    public static DescribeJianYuTestGetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJianYuTestGetResponse self = new DescribeJianYuTestGetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJianYuTestGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJianYuTestGetResponse setBody(DescribeJianYuTestGetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJianYuTestGetResponseBody getBody() {
        return this.body;
    }

}
