// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeReadOnlyAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReadOnlyAccountResponseBody body;

    public static DescribeReadOnlyAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadOnlyAccountResponse self = new DescribeReadOnlyAccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReadOnlyAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReadOnlyAccountResponse setBody(DescribeReadOnlyAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReadOnlyAccountResponseBody getBody() {
        return this.body;
    }

}
