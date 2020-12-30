// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterTemplateResponseBody body;

    public static DescribeClusterTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterTemplateResponse self = new DescribeClusterTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterTemplateResponse setBody(DescribeClusterTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterTemplateResponseBody getBody() {
        return this.body;
    }

}
