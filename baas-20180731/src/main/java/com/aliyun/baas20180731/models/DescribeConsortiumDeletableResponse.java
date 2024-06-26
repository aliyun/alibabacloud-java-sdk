// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumDeletableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumDeletableResponseBody body;

    public static DescribeConsortiumDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumDeletableResponse self = new DescribeConsortiumDeletableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumDeletableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumDeletableResponse setBody(DescribeConsortiumDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumDeletableResponseBody getBody() {
        return this.body;
    }

}
