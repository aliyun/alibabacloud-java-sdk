// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAclsResponseBody body;

    public static DescribeAclsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclsResponse self = new DescribeAclsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclsResponse setBody(DescribeAclsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclsResponseBody getBody() {
        return this.body;
    }

}
