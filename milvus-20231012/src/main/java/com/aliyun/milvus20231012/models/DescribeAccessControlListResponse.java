// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessControlListResponseBody body;

    public static DescribeAccessControlListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListResponse self = new DescribeAccessControlListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessControlListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessControlListResponse setBody(DescribeAccessControlListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessControlListResponseBody getBody() {
        return this.body;
    }

}
