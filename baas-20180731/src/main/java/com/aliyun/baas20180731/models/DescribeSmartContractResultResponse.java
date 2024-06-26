// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSmartContractResultResponseBody body;

    public static DescribeSmartContractResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractResultResponse self = new DescribeSmartContractResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartContractResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartContractResultResponse setBody(DescribeSmartContractResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartContractResultResponseBody getBody() {
        return this.body;
    }

}
