// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsByApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePluginsByApiResponseBody body;

    public static DescribePluginsByApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsByApiResponse self = new DescribePluginsByApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribePluginsByApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePluginsByApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePluginsByApiResponse setBody(DescribePluginsByApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginsByApiResponseBody getBody() {
        return this.body;
    }

}
