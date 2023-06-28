// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOpEntitiesResponseBody body;

    public static DescribeOpEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpEntitiesResponse self = new DescribeOpEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpEntitiesResponse setBody(DescribeOpEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpEntitiesResponseBody getBody() {
        return this.body;
    }

}
