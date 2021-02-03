// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeRelatedAuthorizationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRelatedAuthorizationStatusResponseBody body;

    public static DescribeRelatedAuthorizationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRelatedAuthorizationStatusResponse self = new DescribeRelatedAuthorizationStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRelatedAuthorizationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRelatedAuthorizationStatusResponse setBody(DescribeRelatedAuthorizationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRelatedAuthorizationStatusResponseBody getBody() {
        return this.body;
    }

}
