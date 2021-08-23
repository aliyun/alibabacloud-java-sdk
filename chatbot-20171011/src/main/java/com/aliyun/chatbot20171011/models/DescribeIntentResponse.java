// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeIntentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIntentResponseBody body;

    public static DescribeIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentResponse self = new DescribeIntentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIntentResponse setBody(DescribeIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIntentResponseBody getBody() {
        return this.body;
    }

}
