// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeAddressOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAddressOverviewResponseBody body;

    public static DescribeAddressOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressOverviewResponse self = new DescribeAddressOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAddressOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAddressOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAddressOverviewResponse setBody(DescribeAddressOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAddressOverviewResponseBody getBody() {
        return this.body;
    }

}
