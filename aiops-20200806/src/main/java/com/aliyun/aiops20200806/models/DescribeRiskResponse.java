// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRiskResponseBody body;

    public static DescribeRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskResponse self = new DescribeRiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskResponse setBody(DescribeRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskResponseBody getBody() {
        return this.body;
    }

}
