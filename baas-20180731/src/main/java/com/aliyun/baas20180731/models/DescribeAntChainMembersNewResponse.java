// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMembersNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainMembersNewResponseBody body;

    public static DescribeAntChainMembersNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMembersNewResponse self = new DescribeAntChainMembersNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMembersNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainMembersNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainMembersNewResponse setBody(DescribeAntChainMembersNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainMembersNewResponseBody getBody() {
        return this.body;
    }

}
