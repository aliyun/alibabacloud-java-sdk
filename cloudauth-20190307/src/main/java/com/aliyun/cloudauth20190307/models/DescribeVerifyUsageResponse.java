// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVerifyUsageResponseBody body;

    public static DescribeVerifyUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyUsageResponse self = new DescribeVerifyUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyUsageResponse setBody(DescribeVerifyUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyUsageResponseBody getBody() {
        return this.body;
    }

}
