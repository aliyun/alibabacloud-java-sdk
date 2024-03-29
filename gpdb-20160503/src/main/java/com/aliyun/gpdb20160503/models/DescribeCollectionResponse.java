// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeCollectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCollectionResponseBody body;

    public static DescribeCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollectionResponse self = new DescribeCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCollectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCollectionResponse setBody(DescribeCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCollectionResponseBody getBody() {
        return this.body;
    }

}
