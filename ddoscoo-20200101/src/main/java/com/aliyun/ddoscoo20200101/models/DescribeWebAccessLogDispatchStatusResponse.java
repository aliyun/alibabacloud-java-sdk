// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogDispatchStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebAccessLogDispatchStatusResponseBody body;

    public static DescribeWebAccessLogDispatchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogDispatchStatusResponse self = new DescribeWebAccessLogDispatchStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogDispatchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAccessLogDispatchStatusResponse setBody(DescribeWebAccessLogDispatchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAccessLogDispatchStatusResponseBody getBody() {
        return this.body;
    }

}
