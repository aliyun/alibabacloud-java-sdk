// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogConfigResponseBody body;

    public static DescribeLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogConfigResponse self = new DescribeLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogConfigResponse setBody(DescribeLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogConfigResponseBody getBody() {
        return this.body;
    }

}
