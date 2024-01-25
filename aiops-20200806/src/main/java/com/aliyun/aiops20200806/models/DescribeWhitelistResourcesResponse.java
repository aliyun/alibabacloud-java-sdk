// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeWhitelistResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWhitelistResourcesResponseBody body;

    public static DescribeWhitelistResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistResourcesResponse self = new DescribeWhitelistResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhitelistResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWhitelistResourcesResponse setBody(DescribeWhitelistResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhitelistResourcesResponseBody getBody() {
        return this.body;
    }

}
