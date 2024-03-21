// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEntitiesResponse setBody(DescribeEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEntitiesResponseBody getBody() {
        return this.body;
    }

}
