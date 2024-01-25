// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginsResponseBody body;

    public static DescribePluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsResponse self = new DescribePluginsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginsResponse setBody(DescribePluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginsResponseBody getBody() {
        return this.body;
    }

}
