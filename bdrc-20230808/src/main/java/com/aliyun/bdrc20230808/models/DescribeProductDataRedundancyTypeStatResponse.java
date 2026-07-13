// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductDataRedundancyTypeStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductDataRedundancyTypeStatResponseBody body;

    public static DescribeProductDataRedundancyTypeStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductDataRedundancyTypeStatResponse self = new DescribeProductDataRedundancyTypeStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductDataRedundancyTypeStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductDataRedundancyTypeStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductDataRedundancyTypeStatResponse setBody(DescribeProductDataRedundancyTypeStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductDataRedundancyTypeStatResponseBody getBody() {
        return this.body;
    }

}
