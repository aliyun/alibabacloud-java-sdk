// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEntitiesResponseBody body;

    public static DescribeEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntitiesResponse self = new DescribeEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEntitiesResponse setBody(DescribeEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEntitiesResponseBody getBody() {
        return this.body;
    }

}
