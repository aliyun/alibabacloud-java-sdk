// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpWhitelistResponseBody body;

    public static DescribeIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistResponse self = new DescribeIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpWhitelistResponse setBody(DescribeIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
