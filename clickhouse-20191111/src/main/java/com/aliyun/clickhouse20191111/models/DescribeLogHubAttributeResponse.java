// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogHubAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogHubAttributeResponseBody body;

    public static DescribeLogHubAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogHubAttributeResponse self = new DescribeLogHubAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogHubAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogHubAttributeResponse setBody(DescribeLogHubAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogHubAttributeResponseBody getBody() {
        return this.body;
    }

}
