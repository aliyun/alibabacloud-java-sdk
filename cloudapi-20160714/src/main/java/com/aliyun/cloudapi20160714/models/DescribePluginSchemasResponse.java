// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginSchemasResponseBody body;

    public static DescribePluginSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginSchemasResponse self = new DescribePluginSchemasResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginSchemasResponse setBody(DescribePluginSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginSchemasResponseBody getBody() {
        return this.body;
    }

}
