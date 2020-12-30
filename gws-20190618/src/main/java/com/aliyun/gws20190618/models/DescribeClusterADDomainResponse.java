// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterADDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterADDomainResponseBody body;

    public static DescribeClusterADDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterADDomainResponse self = new DescribeClusterADDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterADDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterADDomainResponse setBody(DescribeClusterADDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterADDomainResponseBody getBody() {
        return this.body;
    }

}
