// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlackListClientsResponseBody body;

    public static DescribeBlackListClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListClientsResponse self = new DescribeBlackListClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlackListClientsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlackListClientsResponse setBody(DescribeBlackListClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlackListClientsResponseBody getBody() {
        return this.body;
    }

}
