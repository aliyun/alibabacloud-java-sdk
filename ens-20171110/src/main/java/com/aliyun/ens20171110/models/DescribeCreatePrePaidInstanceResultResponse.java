// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCreatePrePaidInstanceResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCreatePrePaidInstanceResultResponseBody body;

    public static DescribeCreatePrePaidInstanceResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreatePrePaidInstanceResultResponse self = new DescribeCreatePrePaidInstanceResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreatePrePaidInstanceResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreatePrePaidInstanceResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreatePrePaidInstanceResultResponse setBody(DescribeCreatePrePaidInstanceResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreatePrePaidInstanceResultResponseBody getBody() {
        return this.body;
    }

}
