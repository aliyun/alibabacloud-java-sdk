// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RuleAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLayer4RuleAttributesResponseBody body;

    public static DescribeLayer4RuleAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RuleAttributesResponse self = new DescribeLayer4RuleAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RuleAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLayer4RuleAttributesResponse setBody(DescribeLayer4RuleAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLayer4RuleAttributesResponseBody getBody() {
        return this.body;
    }

}
