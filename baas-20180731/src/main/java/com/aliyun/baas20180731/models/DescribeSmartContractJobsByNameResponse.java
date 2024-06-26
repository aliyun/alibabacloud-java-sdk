// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobsByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSmartContractJobsByNameResponseBody body;

    public static DescribeSmartContractJobsByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobsByNameResponse self = new DescribeSmartContractJobsByNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobsByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmartContractJobsByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmartContractJobsByNameResponse setBody(DescribeSmartContractJobsByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmartContractJobsByNameResponseBody getBody() {
        return this.body;
    }

}
