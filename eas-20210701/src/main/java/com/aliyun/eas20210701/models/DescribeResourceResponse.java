// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Resource body;

    public static DescribeResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceResponse self = new DescribeResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceResponse setBody(Resource body) {
        this.body = body;
        return this;
    }
    public Resource getBody() {
        return this.body;
    }

}
