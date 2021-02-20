// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebCCRulesResponseBody body;

    public static DescribeWebCCRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCCRulesResponse self = new DescribeWebCCRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebCCRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCCRulesResponse setBody(DescribeWebCCRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebCCRulesResponseBody getBody() {
        return this.body;
    }

}
