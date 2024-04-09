// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeRdMemberListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRdMemberListResponseBody body;

    public static DescribeRdMemberListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdMemberListResponse self = new DescribeRdMemberListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdMemberListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRdMemberListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRdMemberListResponse setBody(DescribeRdMemberListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRdMemberListResponseBody getBody() {
        return this.body;
    }

}
