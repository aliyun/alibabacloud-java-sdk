// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustomEventAttributeResponseBody body;

    public static DescribeCustomEventAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventAttributeResponse self = new DescribeCustomEventAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomEventAttributeResponse setBody(DescribeCustomEventAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomEventAttributeResponseBody getBody() {
        return this.body;
    }

}
