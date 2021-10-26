// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendDifferentApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackendDifferentApisResponseBody body;

    public static DescribeBackendDifferentApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendDifferentApisResponse self = new DescribeBackendDifferentApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackendDifferentApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackendDifferentApisResponse setBody(DescribeBackendDifferentApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackendDifferentApisResponseBody getBody() {
        return this.body;
    }

}
