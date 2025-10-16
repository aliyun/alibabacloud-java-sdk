// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCtrlInstanceMemberAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCtrlInstanceMemberAccountsResponseBody body;

    public static DescribeCtrlInstanceMemberAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCtrlInstanceMemberAccountsResponse self = new DescribeCtrlInstanceMemberAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCtrlInstanceMemberAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCtrlInstanceMemberAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCtrlInstanceMemberAccountsResponse setBody(DescribeCtrlInstanceMemberAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCtrlInstanceMemberAccountsResponseBody getBody() {
        return this.body;
    }

}
