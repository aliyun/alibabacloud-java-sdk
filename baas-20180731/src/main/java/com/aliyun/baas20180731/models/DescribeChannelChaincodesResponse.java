// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChannelChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChannelChaincodesResponseBody body;

    public static DescribeChannelChaincodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelChaincodesResponse self = new DescribeChannelChaincodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelChaincodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelChaincodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelChaincodesResponse setBody(DescribeChannelChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelChaincodesResponseBody getBody() {
        return this.body;
    }

}
