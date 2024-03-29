// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeUserWhiteListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserWhiteListsResponseBody body;

    public static DescribeUserWhiteListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserWhiteListsResponse self = new DescribeUserWhiteListsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserWhiteListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserWhiteListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserWhiteListsResponse setBody(DescribeUserWhiteListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserWhiteListsResponseBody getBody() {
        return this.body;
    }

}
