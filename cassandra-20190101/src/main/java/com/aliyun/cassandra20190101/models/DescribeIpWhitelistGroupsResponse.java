// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIpWhitelistGroupsResponseBody body;

    public static DescribeIpWhitelistGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistGroupsResponse self = new DescribeIpWhitelistGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpWhitelistGroupsResponse setBody(DescribeIpWhitelistGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpWhitelistGroupsResponseBody getBody() {
        return this.body;
    }

}
