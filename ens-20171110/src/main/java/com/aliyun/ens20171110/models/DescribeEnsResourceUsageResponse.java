// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnsResourceUsageResponseBody body;

    public static DescribeEnsResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsResourceUsageResponse self = new DescribeEnsResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnsResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnsResourceUsageResponse setBody(DescribeEnsResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnsResourceUsageResponseBody getBody() {
        return this.body;
    }

}
