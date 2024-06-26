// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSmartContractJobsResponseBody body;

    public static DescribeSmartContractJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobsResponse self = new DescribeSmartContractJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartContractJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartContractJobsResponse setBody(DescribeSmartContractJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartContractJobsResponseBody getBody() {
        return this.body;
    }

}
