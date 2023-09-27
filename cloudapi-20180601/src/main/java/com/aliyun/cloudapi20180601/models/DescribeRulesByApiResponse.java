// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeRulesByApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRulesByApiResponseBody body;

    public static DescribeRulesByApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRulesByApiResponse self = new DescribeRulesByApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRulesByApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRulesByApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRulesByApiResponse setBody(DescribeRulesByApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRulesByApiResponseBody getBody() {
        return this.body;
    }

}
