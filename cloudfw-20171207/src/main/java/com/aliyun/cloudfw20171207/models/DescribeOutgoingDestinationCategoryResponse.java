// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutgoingDestinationCategoryResponseBody body;

    public static DescribeOutgoingDestinationCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationCategoryResponse self = new DescribeOutgoingDestinationCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutgoingDestinationCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutgoingDestinationCategoryResponse setBody(DescribeOutgoingDestinationCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutgoingDestinationCategoryResponseBody getBody() {
        return this.body;
    }

}
