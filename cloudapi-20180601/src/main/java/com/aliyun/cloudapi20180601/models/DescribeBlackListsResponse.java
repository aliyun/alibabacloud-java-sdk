// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeBlackListsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBlackListsResponseBody body;

    public static DescribeBlackListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListsResponse self = new DescribeBlackListsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlackListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlackListsResponse setBody(DescribeBlackListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlackListsResponseBody getBody() {
        return this.body;
    }

}
