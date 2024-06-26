// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainApplicationsResponseBody body;

    public static DescribeAntChainApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainApplicationsResponse self = new DescribeAntChainApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainApplicationsResponse setBody(DescribeAntChainApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainApplicationsResponseBody getBody() {
        return this.body;
    }

}
