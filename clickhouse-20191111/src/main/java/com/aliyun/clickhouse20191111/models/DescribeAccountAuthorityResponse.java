// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeAccountAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccountAuthorityResponseBody body;

    public static DescribeAccountAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAuthorityResponse self = new DescribeAccountAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountAuthorityResponse setBody(DescribeAccountAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountAuthorityResponseBody getBody() {
        return this.body;
    }

}
