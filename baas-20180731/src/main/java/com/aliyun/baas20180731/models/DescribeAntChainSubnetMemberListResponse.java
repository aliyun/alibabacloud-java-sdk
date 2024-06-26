// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainSubnetMemberListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainSubnetMemberListResponseBody body;

    public static DescribeAntChainSubnetMemberListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainSubnetMemberListResponse self = new DescribeAntChainSubnetMemberListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainSubnetMemberListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainSubnetMemberListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainSubnetMemberListResponse setBody(DescribeAntChainSubnetMemberListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainSubnetMemberListResponseBody getBody() {
        return this.body;
    }

}
