// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessControlListsResponseBody body;

    public static DescribeAccessControlListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListsResponse self = new DescribeAccessControlListsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessControlListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessControlListsResponse setBody(DescribeAccessControlListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessControlListsResponseBody getBody() {
        return this.body;
    }

}
