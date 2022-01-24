// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackendInfoResponseBody body;

    public static DescribeBackendInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendInfoResponse self = new DescribeBackendInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackendInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackendInfoResponse setBody(DescribeBackendInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackendInfoResponseBody getBody() {
        return this.body;
    }

}
