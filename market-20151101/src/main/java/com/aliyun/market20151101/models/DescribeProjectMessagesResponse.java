// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectMessagesResponseBody body;

    public static DescribeProjectMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMessagesResponse self = new DescribeProjectMessagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectMessagesResponse setBody(DescribeProjectMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectMessagesResponseBody getBody() {
        return this.body;
    }

}
