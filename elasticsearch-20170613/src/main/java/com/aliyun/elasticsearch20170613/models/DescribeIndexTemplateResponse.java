// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeIndexTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIndexTemplateResponseBody body;

    public static DescribeIndexTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIndexTemplateResponse self = new DescribeIndexTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIndexTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIndexTemplateResponse setBody(DescribeIndexTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIndexTemplateResponseBody getBody() {
        return this.body;
    }

}
