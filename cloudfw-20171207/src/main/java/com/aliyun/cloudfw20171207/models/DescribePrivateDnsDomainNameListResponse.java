// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsDomainNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrivateDnsDomainNameListResponseBody body;

    public static DescribePrivateDnsDomainNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsDomainNameListResponse self = new DescribePrivateDnsDomainNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsDomainNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrivateDnsDomainNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrivateDnsDomainNameListResponse setBody(DescribePrivateDnsDomainNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrivateDnsDomainNameListResponseBody getBody() {
        return this.body;
    }

}
