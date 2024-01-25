// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginApisResponseBody body;

    public static DescribePluginApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginApisResponse self = new DescribePluginApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginApisResponse setBody(DescribePluginApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginApisResponseBody getBody() {
        return this.body;
    }

}
