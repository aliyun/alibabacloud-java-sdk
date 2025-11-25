// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeIspInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIspInfoResponseBody body;

    public static DescribeIspInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspInfoResponse self = new DescribeIspInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIspInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIspInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIspInfoResponse setBody(DescribeIspInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIspInfoResponseBody getBody() {
        return this.body;
    }

}
