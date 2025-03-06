// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginGroupsResponseBody body;

    public static DescribePluginGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginGroupsResponse self = new DescribePluginGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginGroupsResponse setBody(DescribePluginGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginGroupsResponseBody getBody() {
        return this.body;
    }

}
