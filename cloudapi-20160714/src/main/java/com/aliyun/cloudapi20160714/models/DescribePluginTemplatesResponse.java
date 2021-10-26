// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePluginTemplatesResponse setBody(DescribePluginTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginTemplatesResponseBody getBody() {
        return this.body;
    }

}
