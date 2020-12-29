// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainConsortiumsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAntChainConsortiumsResponseBody body;

    public static DescribeAntChainConsortiumsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConsortiumsResponse self = new DescribeAntChainConsortiumsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConsortiumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainConsortiumsResponse setBody(DescribeAntChainConsortiumsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainConsortiumsResponseBody getBody() {
        return this.body;
    }

}
