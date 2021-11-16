// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterAddonMetadataResponseBody body;

    public static DescribeClusterAddonMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonMetadataResponse self = new DescribeClusterAddonMetadataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterAddonMetadataResponse setBody(DescribeClusterAddonMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterAddonMetadataResponseBody getBody() {
        return this.body;
    }

}
