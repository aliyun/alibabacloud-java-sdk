// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkRuleAttributesResponseBody body;

    public static DescribeNetworkRuleAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRuleAttributesResponse self = new DescribeNetworkRuleAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRuleAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkRuleAttributesResponse setBody(DescribeNetworkRuleAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkRuleAttributesResponseBody getBody() {
        return this.body;
    }

}
