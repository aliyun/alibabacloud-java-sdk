// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeKnowledgeResponseBody body;

    public static DescribeKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeResponse self = new DescribeKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKnowledgeResponse setBody(DescribeKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKnowledgeResponseBody getBody() {
        return this.body;
    }

}
