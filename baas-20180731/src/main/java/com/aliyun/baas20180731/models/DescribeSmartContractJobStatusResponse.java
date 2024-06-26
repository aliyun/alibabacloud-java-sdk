// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSmartContractJobStatusResponseBody body;

    public static DescribeSmartContractJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobStatusResponse self = new DescribeSmartContractJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartContractJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartContractJobStatusResponse setBody(DescribeSmartContractJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartContractJobStatusResponseBody getBody() {
        return this.body;
    }

}
