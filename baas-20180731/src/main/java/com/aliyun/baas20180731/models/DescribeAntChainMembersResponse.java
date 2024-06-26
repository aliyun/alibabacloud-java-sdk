// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainMembersResponseBody body;

    public static DescribeAntChainMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMembersResponse self = new DescribeAntChainMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMembersResponse setBody(DescribeAntChainMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMembersResponseBody getBody() {
        return this.body;
    }

}
