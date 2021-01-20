// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectMetaResponseBody body;

    public static DescribeProjectMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaResponse self = new DescribeProjectMetaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectMetaResponse setBody(DescribeProjectMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectMetaResponseBody getBody() {
        return this.body;
    }

}
