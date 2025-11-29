// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRebalanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRebalanceStatusResponseBody body;

    public static DescribeRebalanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRebalanceStatusResponse self = new DescribeRebalanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRebalanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRebalanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRebalanceStatusResponse setBody(DescribeRebalanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRebalanceStatusResponseBody getBody() {
        return this.body;
    }

}
