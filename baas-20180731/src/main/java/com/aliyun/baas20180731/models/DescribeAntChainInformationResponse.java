// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainInformationResponseBody body;

    public static DescribeAntChainInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainInformationResponse self = new DescribeAntChainInformationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainInformationResponse setBody(DescribeAntChainInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainInformationResponseBody getBody() {
        return this.body;
    }

}
