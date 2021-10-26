// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePluginsResponse setBody(DescribePluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePluginsResponseBody getBody() {
        return this.body;
    }

}
