// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginTemplatesResponseBody body;

    public static DescribePluginTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginTemplatesResponse self = new DescribePluginTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginTemplatesResponse setBody(DescribePluginTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginTemplatesResponseBody getBody() {
        return this.body;
    }

}
