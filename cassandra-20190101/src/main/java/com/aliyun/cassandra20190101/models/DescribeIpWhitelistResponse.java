// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeIpWhitelistResponse setBody(DescribeIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
