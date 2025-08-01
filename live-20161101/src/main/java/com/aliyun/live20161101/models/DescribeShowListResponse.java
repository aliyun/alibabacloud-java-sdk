// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeShowListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeShowListResponseBody body;

    public static DescribeShowListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShowListResponse self = new DescribeShowListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeShowListResponse setBody(DescribeShowListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShowListResponseBody getBody() {
        return this.body;
    }

}
