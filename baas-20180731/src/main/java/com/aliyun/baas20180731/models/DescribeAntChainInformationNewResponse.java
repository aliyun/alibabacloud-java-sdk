// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainInformationNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntChainInformationNewResponseBody body;

    public static DescribeAntChainInformationNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainInformationNewResponse self = new DescribeAntChainInformationNewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainInformationNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntChainInformationNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntChainInformationNewResponse setBody(DescribeAntChainInformationNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntChainInformationNewResponseBody getBody() {
        return this.body;
    }

}
