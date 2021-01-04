// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUserFlowInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserFlowInfoResponseBody body;

    public static DescribeUserFlowInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowInfoResponse self = new DescribeUserFlowInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserFlowInfoResponse setBody(DescribeUserFlowInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserFlowInfoResponseBody getBody() {
        return this.body;
    }

}
