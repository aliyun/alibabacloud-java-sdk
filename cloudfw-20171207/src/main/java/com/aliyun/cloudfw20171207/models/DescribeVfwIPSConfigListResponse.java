// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVfwIPSConfigListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVfwIPSConfigListResponseBody body;

    public static DescribeVfwIPSConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVfwIPSConfigListResponse self = new DescribeVfwIPSConfigListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVfwIPSConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVfwIPSConfigListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVfwIPSConfigListResponse setBody(DescribeVfwIPSConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVfwIPSConfigListResponseBody getBody() {
        return this.body;
    }

}
