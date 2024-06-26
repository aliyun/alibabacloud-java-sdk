// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumChaincodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumChaincodesResponseBody body;

    public static DescribeConsortiumChaincodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumChaincodesResponse self = new DescribeConsortiumChaincodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumChaincodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumChaincodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumChaincodesResponse setBody(DescribeConsortiumChaincodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumChaincodesResponseBody getBody() {
        return this.body;
    }

}
