// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAccordanceApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccordanceApisResponseBody body;

    public static DescribeAccordanceApisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccordanceApisResponse self = new DescribeAccordanceApisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccordanceApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccordanceApisResponse setBody(DescribeAccordanceApisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccordanceApisResponseBody getBody() {
        return this.body;
    }

}
