// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataReDistributeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataReDistributeInfoResponseBody body;

    public static DescribeDataReDistributeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataReDistributeInfoResponse self = new DescribeDataReDistributeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataReDistributeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataReDistributeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataReDistributeInfoResponse setBody(DescribeDataReDistributeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataReDistributeInfoResponseBody getBody() {
        return this.body;
    }

}
