// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbLogInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstDbLogInfoResponseBody body;

    public static DescribeInstDbLogInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbLogInfoResponse self = new DescribeInstDbLogInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbLogInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstDbLogInfoResponse setBody(DescribeInstDbLogInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstDbLogInfoResponseBody getBody() {
        return this.body;
    }

}
